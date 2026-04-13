package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    String fieldName;
    String field;
    String resourceName;
    long fieldId;

    public ResourceNotFoundException(){}

    public ResourceNotFoundException(String resourceName, String field, String fieldName) {
        super(String.format("%s not found  with %s: %s", resourceName, field ,fieldName));
        this.fieldName = fieldName;
        this.field = field;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String resourceName, String field, long fieldId) {
        super(String.format("%s not found  with %s: %d", resourceName, field ,fieldId));
        this.fieldId = fieldId;
        this.resourceName = resourceName;
        this.field = field;
    }
}
