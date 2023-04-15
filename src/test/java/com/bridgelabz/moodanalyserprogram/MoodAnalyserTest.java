package com.bridgelabz.moodanalyserprogram;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertThat;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class MoodAnalyserTest {
	public static void main(String[] args) {
		try {
			// Test case 1: Null mood
			String mood1 = null;
			MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer();
			String analyzedMood1 = moodAnalyzer1.analyzeMood(mood1);
			System.out.println("Analyzed Mood 1: " + analyzedMood1);
		} catch (MoodAnalysisException e) {
			System.out.println("Error 1: " + e.getMessage());
		}

		try {
			// Test case 2: Empty mood
			String mood2 = "";
			MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer();
			String analyzedMood2 = moodAnalyzer2.analyzeMood(mood2);
			System.out.println("Analyzed Mood 2: " + analyzedMood2);
		} catch (MoodAnalysisException e) {
			System.out.println("Error 2: " + e.getMessage());
		}

		try {
			// Test case 3: Valid mood
			String mood3 = "happy";
			MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer();
			String analyzedMood3 = moodAnalyzer3.analyzeMood(mood3);
			System.out.println("Analyzed Mood 3: " + analyzedMood3);
		} catch (MoodAnalysisException e) {
			System.out.println("Error 3: " + e.getMessage());
		}
	}
}