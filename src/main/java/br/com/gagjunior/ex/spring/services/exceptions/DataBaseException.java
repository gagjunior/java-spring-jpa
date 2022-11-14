package br.com.gagjunior.ex.spring.services.exceptions;

public class DataBaseException extends RuntimeException{

    public DataBaseException(String msg){
        super(msg);
    }
}
