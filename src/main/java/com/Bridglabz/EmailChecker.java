package com.Bridglabz;

import java.util.regex.Pattern;

public class EmailChecker {
	private static final String Email_PATTERN = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(Email_PATTERN);
        return pattern.matches(Email_PATTERN,email);
    }
}
