package com.bridgelabz;

import java.util.regex.Pattern;

public class ValidEmail {
    String EMAILADDRESS = "^[a-z0-9]+[\\.\\-\\+]?[a-z0-9]+[\\@][a-z0-9]{1,}[\\.][a-z]+([\\.]?[a-z]+)$";

    /**
     *
     * @param email
     * @return
     */
    public boolean validateEmail(String email) {
        Pattern pattern=Pattern.compile(EMAILADDRESS);
        return pattern.matcher(email).matches();
    }
}
