package edu.wctc;

public class InvalidBirthdayException extends Exception{

    public InvalidBirthdayException(int year, int month, int day){
        super(String.format("THE DAY OF BIRTH ENTERED, %d/%d/%d, IS NOT VALID.", month, day, year));
    }

}
