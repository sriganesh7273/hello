package com.sapient.asde.exception;


public class EmployeeException extends Exception{

    public EmployeeException(){
    }

    public EmployeeException(String string){
        super(string);
    }
    public EmployeeException(String string,Throwable t){
        super(string,t);
    }
}
