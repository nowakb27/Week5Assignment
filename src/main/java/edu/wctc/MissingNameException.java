package edu.wctc;

public class MissingNameException extends Exception{

    public MissingNameException(String nameType){
        super(String.format("THE FIELD, %s, WAS LEFT BLANK.", nameType));
    }

}