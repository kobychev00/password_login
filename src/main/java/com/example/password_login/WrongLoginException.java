package com.example.password_login;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super (message);
    }
}
