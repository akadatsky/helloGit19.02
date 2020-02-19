package com.akadatsky;

public class MyRuntimeException extends RuntimeException {

    private String details;

    // test
    public MyRuntimeException(String message, String details) {
        super(message);
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

}
