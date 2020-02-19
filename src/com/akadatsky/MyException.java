package com.akadatsky;

public class MyException extends Exception {

    private String details;

    public MyException(String message, String details) {
        super(message);
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}
