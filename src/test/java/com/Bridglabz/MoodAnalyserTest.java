package com.Bridglabz;

import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;

import org.junit.Test;

public class MoodAnalyserTest 
{ @Test
    public void given_Mood_When_Sad_ReturnMessage() throws MoodAnalyserException{
    MoodAnalyser moodTesting = new MoodAnalyser();
    String mood_Store=moodTesting.moodAnalyser("I am in Sad Mood");
    assertEquals("SAD",mood_Store);

}
@Test
public void given_Mood_When_Happy_ReturnMessage() throws MoodAnalyserException {
    MoodAnalyser moodTesting = new MoodAnalyser();
    String mood_Store = moodTesting.moodAnalyser("I am in Happy Mood");
    assertEquals("HAPPY", mood_Store);
}

@Test()
public void given_Null_ThrowException() {
    MoodAnalyser moodTesting=new MoodAnalyser(null);
    try{
        moodTesting.moodAnalyser(null);
    }
    catch(MoodAnalyserException e)
    {
        assertEquals(MoodAnalyserException.exceptionType.NULL,e.type);
    }
}

    @Test
    public void given_Empty_ThrowException() {
        MoodAnalyser moodTesting=new MoodAnalyser();
        try{
            moodTesting.moodAnalyser("");
        }
        catch(MoodAnalyserException e)
        {
            assertEquals(MoodAnalyserException.exceptionType.EMPTY,e.type);
        }
    }
}
