package com.app.categoryservice.exception;


public class MessageNotFoundException extends RuntimeException {

    public MessageNotFoundException(String message){
        super(message);
    }
}
