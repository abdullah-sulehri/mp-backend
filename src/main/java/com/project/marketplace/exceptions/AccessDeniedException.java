package com.project.marketplace.exceptions;

public class AccessDeniedException extends RuntimeException{
    public AccessDeniedException(String exp){
        super(exp);
    }
}
