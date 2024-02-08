package com.chief;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public boolean checkEmailValidity(String email) {

        final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);

        Matcher matcher =emailPattern.matcher(email);

        return matcher.matches();
    }

    public static void main(String[] args) {

    }
}
