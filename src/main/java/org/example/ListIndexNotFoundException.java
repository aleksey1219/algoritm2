package org.example;

public class ListIndexNotFoundException extends RuntimeException {

    public ListIndexNotFoundException() {
    }

    public ListIndexNotFoundException(String message) {
        super(message);
    }

    public ListIndexNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListIndexNotFoundException(Throwable cause) {
        super(cause);
    }

    public ListIndexNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
