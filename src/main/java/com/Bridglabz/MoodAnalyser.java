package com.Bridglabz;

import java.util.Locale;

public class MoodAnalyser 
{
	private String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String moodAnalyser(String message) throws MoodAnalyserException {
        try {
            if(message.length()==0)
                throw new MoodAnalyserException(MoodAnalyserException.exceptionType.EMPTY,"YOU HAVE GIVEN EMPTY,PLEASE CHECK AGAIN");
            if (message.toLowerCase(Locale.ROOT).contains("sad")) {
                return "SAD";
            }
             else
                    return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NULL,"You have given NULL, PLEASE TRY AGAIN");
        }
    }
}