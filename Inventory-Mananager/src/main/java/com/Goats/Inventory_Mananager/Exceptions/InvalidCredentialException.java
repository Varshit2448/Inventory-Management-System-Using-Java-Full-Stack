package com.Goats.Inventory_Mananager.Exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException(String message){
        super(message);
    }
}
