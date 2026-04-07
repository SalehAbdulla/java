package com.ecommerce.project.exceptions;

public class myNotFoundException extends RuntimeException {
    String fieldName;
    String field;
    String resourceName;
    int fieldId;

    public myNotFoundException(){}

    public myNotFoundException(String fieldName, String field, String resourceName) {
        super(String.format("%s is not found %s: %s\n", resourceName, field, fieldName));
        this.fieldName = fieldName;
        this.field = field;
        this.resourceName = resourceName;
    }

    public myNotFoundException(int fieldId, String field, String resourceName) {
        super(String.format("%s is not found %s: %d\n", resourceName, field, fieldId));
        this.field = field;
        this.fieldId = fieldId;
        this.resourceName =resourceName;
    }
}
