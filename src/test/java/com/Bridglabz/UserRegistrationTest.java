package com.Bridglabz;



import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

	

    

	@Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean firstName = userRegistration.validateFirstName("Vishaka");
	        Assert.assertTrue(firstName);
	    }

	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean lastName = userRegistration.validateLastName("Kadam");
	        Assert.assertTrue(lastName);
	    }

	    @Test
	    public void givenEmail_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean email = userRegistration.validateEmail("vishaka.kadam01@gmail.com");
	        Assert.assertTrue(email);
	    }

	    @Test
	    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean phoneNumber = userRegistration.validatePhoneNumber("91 9014905739");
	        Assert.assertTrue(phoneNumber);
	    }

	    
	    @Test
	    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean password = userRegistration.validatePassword("Vishaka@123");
	        Assert.assertTrue(password);
	    }

	    
	   

}
