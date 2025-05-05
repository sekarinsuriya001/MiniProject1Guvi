package com.empdata.employeeManagement.exception;

public class EmpNotFoundException extends RuntimeException {
    public EmpNotFoundException(String message) {
        super(message);
    }
}
