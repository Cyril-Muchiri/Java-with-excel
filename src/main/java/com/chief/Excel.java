package com.chief;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

    public static void main(String[] args) {
        // create a blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // create a worksheet
        XSSFSheet sheet1 = workbook.createSheet("worksheet1");

        // inserting the data
        Map<String, Object[]> dataSet = new TreeMap<>();
        dataSet.put("1", new Object[] { "ID", "NAME", "COMPANY" });
        dataSet.put("2", new Object[] { "1", "James", "Syspro" });
        dataSet.put("3", new Object[] { "2", "Kim", "Safaricom" });
        dataSet.put("4", new Object[] { "3", "James", "Syspro" });
        dataSet.put("5", new Object[] { "4", "James", "Syspro" });

        // iterate over the data to write
        Set<String> set = dataSet.keySet();
        int rowNumber = 0;
        for (String key : set) {
            Row row = sheet1.createRow(rowNumber++);

            Object[] data = dataSet.get(key);
            int cellNo = 0;

            for (Object value : data) {
                Cell cell = row.createCell(cellNo++);
                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                    ;
                }
            }

            // save the file to disk

            try {
                FileOutputStream out = new FileOutputStream("SampleExcel.xlsx");
                workbook.write(out);

                out.close();
                System.out.println("Your excel file is ready!!");
            } catch (IOException e) {

                e.printStackTrace();
            }

        }
    }
}
