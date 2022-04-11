package com.Bridglabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner sc = new Scanner(System.in);

  public static void firstName() {
	        System.out.println("Enter First Name");
	        String fn = sc.nextLine();
	        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fn) == true)
	        {
	            System.out.println("Valid First Name");
	        }
	            
	        else
	        {
	            System.out.println("Invalid First Name");
	        }
	    }
  public static void lastName() {
      System.out.println("Enter Last Name");
      String ln = sc.nextLine();
      if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", ln) == true) 
      {
          System.out.println("Valid Last Name");
      }
      else {
          System.out.println("Invalid Last Name");
      }
  }
  public static void email() {
	  System.out.println("\nEnter EMail");
      String email = sc.nextLine();
      if (Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", email) == true) 
      {
	  System.out.println("Valid Email");
      }
      else {
          System.out.println("Invalid Email");
      }
	  }
  public static void phoneNumber() {
      System.out.println("Enter Phone Number With Country Code(space between code and number)");
	        String phoneNumber = sc.nextLine();
	        if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", phoneNumber) == true) 
	        {
	            System.out.println("Valid Phone Number");
	        }
	        else
	        {
	            System.out.println("Invalid Phone Number");
	        }
	    }
  
	    public static void main(String[] args) {
	        firstName();
	        lastName();
	        email();
	        phoneNumber();
	    }

	

}
