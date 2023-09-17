package org.example;

public class ListNullException extends RuntimeException {

    public ListNullException() {
    }

    public ListNullException(String message) {
        super(message);
    }

    public ListNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListNullException(Throwable cause) {
        super(cause);
    }

    public ListNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
