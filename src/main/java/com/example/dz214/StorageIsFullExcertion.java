package com.example.dz214;

public class StorageIsFullExcertion extends RuntimeException {
    public StorageIsFullExcertion() {
    }

    public StorageIsFullExcertion(String message) {
        super(message);
    }

    public StorageIsFullExcertion(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullExcertion(Throwable cause) {
        super(cause);
    }

    public StorageIsFullExcertion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
