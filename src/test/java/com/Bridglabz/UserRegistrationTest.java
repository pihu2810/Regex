package com.Bridglabz;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	    public void givenFirstName_WhenNotProper_ShouldThrowException() {
	        UserRegistration userRegistration = new UserRegistration();
	        try {
	            userRegistration.validateFirstName("Vishaka");
	        } catch (UserRegistrationException e) {

	            System.out.println(e.getMessage());
	        }
	    }

	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean lastName = false;
	        try {
	            lastName = userRegistration.validateLastName("Kadam");
	        } catch (UserRegistrationException e) {
	            e.printStackTrace();
	        }
	        assertTrue(lastName);
	    }

	    @Test
	    public void givenEmail_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean email = userRegistration.validateEmail("vishaka.kadam01@gmail.com");
	        assertTrue(email);
	    }

	    @Test
	    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean phoneNumber = userRegistration.validatePhoneNumber("91 9014905739");
	        assertTrue(phoneNumber);
	    }

	     @Test
	    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean password = userRegistration.validatePassword("Vishu@123");
	        assertTrue(password);
	    }

	    
}
