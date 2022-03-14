package edu.wctc;

public class UnknownGenderCodeException extends Exception{

    public UnknownGenderCodeException(char genderCode){
        super(String.format("THE GENDER, %c, IS NOT VALID."));
    }

}