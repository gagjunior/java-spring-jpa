package br.com.gagjunior.ex.spring.services.exceptions;

public class ResourceNotFoudException extends RuntimeException {

    public ResourceNotFoudException(Object id) {
        super("Resource not found: id " + id);
    }
}
