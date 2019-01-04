package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {
    public static String ERR_COMPANY_NOT_FOUND="Company not found";
    public static String ERR_EMPLOYEE_NOT_FOUND="Employee not found";
    public static String ERR_COMPANY_NAME_NOT_PROVIDED="Please, provide company name";
    public static String ERR_UNEXPECTED="Unexpected error";
    public static String ERR_EMPLOYEE_NAME_NOT_PROVIDED="Please, provide company name";

    public SearchProcessingException (String message){
        super (message);
    }
}
