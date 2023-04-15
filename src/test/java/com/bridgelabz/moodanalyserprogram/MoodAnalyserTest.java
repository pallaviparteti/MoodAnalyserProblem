package com.bridgelabz.moodanalyserprogram;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoodAnalyserTest {

	@Test
	public void testAnalysisMoodSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void testAnalysisMoodHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("HAPPY", mood);
	}

	@Test
	public void testMoodAnalysisWithNullMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analysisMood();
		assertEquals("HAPPY", mood);
	}

}
