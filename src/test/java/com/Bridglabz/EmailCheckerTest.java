package com.Bridglabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

 public class EmailCheckerTest {
	private String inputEmail;
    private Boolean expectedResult;
    private EmailChecker emailChecker;

    @Before
    public void initialize() {
        emailChecker = new EmailChecker();
    }

    
    public EmailCheckerTest(String inputEmail, Boolean expectedResult) {
        this.inputEmail = inputEmail;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection validaEmail() {
        return Arrays.asList(new Object[][] {
                { "abc@yahoo.com", true },
                { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true },
                { "abc111@abc.com", true },
                { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true },
                { "abc@1.com", true },
                { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", true },
                {"abc",false},
                {"abc@.com.my-tld",false},
                {"abc123@gamil.a",false},
                {"abc123@.com-tld",false},
                {".abc123@.com.com",false},
                {"abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gamil.com",false},
                {"abc.gamail.com",false},
                {"abc@gamil.com.1a",false},
                {"abc@abc@gamail.com",false},
                {"abc@gmail.com.aa.au",false}
        });
    }

    
    @Test
    public void testEmailChecker() {
        System.out.println("Email is : " + inputEmail + "and expected result is : " +expectedResult);
        Assert.assertEquals(expectedResult,emailChecker.validateEmail(inputEmail));
    }
}
