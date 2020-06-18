package com.bridgelabz;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Collection;

import static java.lang.reflect.Array.*;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    String emailId;
    boolean expectedResult;

    public ValidEmailTest(String emailId,boolean expectedResult)
    {
        super();
        this.emailId=emailId;
        this.expectedResult=expectedResult;

    }

    @Before
    public  void  initialise()
    {
        new ValidEmail();

    }
    //ALl Testcase Will Pass
    /**
     *
     * @return
     */
    @Parameterized.Parameters
    public static Collection input()
    {
        return  Arrays.asList( new Object[][] {
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}
        });
    }

    @Test
    public void checkValidEmail() {
        ValidEmail validater = new ValidEmail();
        boolean result = validater.ValidateEmail(this.emailId);
        Assert.assertEquals(this.expectedResult, result);

    }
}
