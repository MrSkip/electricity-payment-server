package com.kursach.kep.exception;

/**
 * Created by kondr on 01.04.2016.
 */

public class ExceptionMySQL extends RuntimeException{

    private String exception;

    public ExceptionMySQL(String exception){
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }

    @Override
    public String toString() {
        return exception;
    }

    @Override
    public String getMessage() {
        return exception;
    }
}