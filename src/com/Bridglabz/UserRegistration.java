package com.Bridglabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner sc = new Scanner(System.in);

  public static void firstName() {
	        System.out.println("Enter First Name");
	        String fn = sc.nextLine();
	        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fn) == true)
	            System.out.println("Valid First Name");
	        else
	            System.out.println("Invalid First Name");
	    }
  public static void lastName() {
      System.out.println("Enter First Name");
      String ln = sc.nextLine();
      if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", ln) == true)
          System.out.println("Valid Last Name");
      else
          System.out.println("Invalid Last Name");
  }
	    public static void main(String[] args) {
	        firstName();
	        lastName();
	    }

	

}
