package com.Bridglabz;

public class MoodAnalyserException extends Exception{

	 public exceptionType type;
	    public MoodAnalyserException(exceptionType type, String message)
	    {
	        super(message);
	        this.type=type;
	    }
	    public enum exceptionType
	    {
	        NULL,
	        EMPTY
	    }
}
