package org.example;

public class ListStorageIsFullException extends RuntimeException {

    public ListStorageIsFullException() {
    }

    public ListStorageIsFullException(String message) {
        super(message);
    }

    public ListStorageIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListStorageIsFullException(Throwable cause) {
        super(cause);
    }

    public ListStorageIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
