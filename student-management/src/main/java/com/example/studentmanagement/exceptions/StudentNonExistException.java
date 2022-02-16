package com.example.studentmanagement.exceptions;

public class StudentNonExistException extends RuntimeException{
    public StudentNonExistException(String message) {
        super(message);
    }
}
