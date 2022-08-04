package me.dio.academia.digital.exception;

public class EntityNotExistsException extends RuntimeException {

    public EntityNotExistsException(String message) {
        super(message);
    }
}
