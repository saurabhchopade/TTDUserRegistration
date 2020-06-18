package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
//============================For FirstName==============================
    @Test
    public void checkFirstName_IfValid_ShouldReturnTrue() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateFirstName("Saurabh");
        Assert.assertEquals(true,result);
    }

    @Test
    public void checkFirstName_Minimum_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateFirstName("Sa");
        Assert.assertEquals(true,result);
    }

    @Test
    public void checkFirstName_FirstLetterNotCapital_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateFirstName("saurabh");
        Assert.assertEquals(true,result);
    }


    @Test
    public void checkFirstName_ContainsNumber_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateFirstName("1112");
        Assert.assertEquals(true,result);
    }


  //  ============================For Last Name===========================

    @Test
    public void checkLastName_IfValid_ShouldReturnTrue() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater. validateLastName("Chopde");
        Assert.assertEquals(true,result);

    }

    @Test
    public void checkLastName_FirstLetterNotCapital_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater. validateLastName("chopde");
        Assert.assertEquals(true,result);

    }

    @Test
    public void checkLastName_ConatainNumbers_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater. validateLastName("Chopde123");
        Assert.assertEquals(true,result);

    }
    // ============================EMAIL ADDRESS==========================

    @Test
    public void checkEmailAddress_ValidEmailID_ShouldReturnTrue() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateEmailAddress("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkEmailAddress_WrongEmail_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateEmailAddress("abc.xyzbl.co.in");
        Assert.assertEquals(true, result);
    }

    //==============================Mobile Number===========================
    @Test
    public void checkMobileNumber_ValidMobile_ShouldReturnTrue() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateMobileNumber("91 8600250537");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkMobileNumber_NotProvidedCountry_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateMobileNumber("8600250537");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkMobileNumber_IncompleteNumber_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validateMobileNumber("91 8600237999");
        Assert.assertEquals(true, result);
    }
    //============================PASSWORD==================================

    @Test
    public void checkPassword_ValidPassword_ShouldReturnTrue() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validatePasswprd("Surabh$123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkPassword_NotValid_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validatePasswprd("123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkPassword_NotNumber_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validatePasswprd("Saurabh@");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkPassword_NotUpperCase_ShouldReturnFalse() {
        UserRegistration validater = new UserRegistration();
        boolean result = validater.validatePasswprd("saurabh@123");
        Assert.assertEquals(true, result);
    }


}
