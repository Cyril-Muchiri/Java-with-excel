package com.chief;

public class App {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public boolean checkEmailValidity(String email) {

        final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (email.length() > 5 && email.contains("@gmail.com")) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

    }
}
