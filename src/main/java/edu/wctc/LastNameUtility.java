package edu.wctc;

import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {

    private static Soundex soundex = new Soundex();

    public String encodeLastName(String lastName) throws MissingNameException {
        if(lastName.isBlank()){
            throw new MissingNameException("lastName");
        }else{
            return soundex.encode(lastName);
        }
    }

}