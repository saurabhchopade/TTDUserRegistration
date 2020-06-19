package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    //All Regx Patterns
    String FIRSTNAMEPATTERN = "^[A-Z]{1}[a-z]{2,}$";
    String LASTNAMEPATTERN = "^[A-Z]{1}[a-z]{2,}$";
    String EMAILADDRESS = "^[a-z0-9]+[\\.\\-\\+]?[a-z0-9]+[\\@][a-z0-9]{1,}[\\.][a-z]+([\\.]?[a-z]+)$";
    String MOBILENUMBERPATTERN = "^[0-9]{1,2}[ ][0-9]{10}$";
    String PASSWORDPATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{4,}[\\@\\#][a-zA-Z0-9]*$";
    /**
     *
     * @param firstName
     * @return
     */
    public boolean validateFirstName(String firstName) {
        Pattern pattern=Pattern.compile(FIRSTNAMEPATTERN);
        return pattern.matcher(firstName).matches();
    }

    /**
     *
     * @param lastName
     * @return
     */
    public boolean validateLastName(String lastName) {
        Pattern pattern=Pattern.compile(LASTNAMEPATTERN);
        return pattern.matcher(lastName).matches();
    }

    /**
     *
     * @param emailId
     * @return
     */
    public boolean validateEmailAddress(String emailId) {
        Pattern pattern=Pattern.compile(EMAILADDRESS);
        return pattern.matcher(emailId).matches();
    }

    /**
     *
     * @param mobileNumber
     * @return
     */
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern=Pattern.compile(MOBILENUMBERPATTERN);
        return pattern.matcher(mobileNumber).matches();
    }

    /**
     *
     * @param password
     * @return
     */
    public boolean validatePasswprd(String password) {
        Pattern pattern = Pattern.compile(PASSWORDPATTERN);
        return pattern.matcher(password).matches();
    }
}
