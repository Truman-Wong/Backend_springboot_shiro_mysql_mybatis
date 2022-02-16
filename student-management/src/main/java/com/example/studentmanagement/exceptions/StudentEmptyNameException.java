package com.example.studentmanagement.exceptions;

public class StudentEmptyNameException extends RuntimeException{
    public StudentEmptyNameException(String message) {
        super(message);
    }
}
