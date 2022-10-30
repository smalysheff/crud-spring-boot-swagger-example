package com.example.student_db_rest_api.exception;

public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException(String message) {
        super(message);
    }
}
