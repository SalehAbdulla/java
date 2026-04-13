package com.ecommerce.project.exceptions;

// ApiException handler bad request errors
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ApiException() {
    }

    public ApiException(String message){
        super(message);
    }


}
