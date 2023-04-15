package com.bridgelabz.moodanalyserprogram;

import java.util.HashMap;
import java.util.Map;

enum MoodEnum {
	HAPPY("happy"), SAD("sad"), ANGRY("angry"), NEUTRAL("neutral");

	private String value;
	private static Map<String, MoodEnum> map = new HashMap<>();

	static {
		for (MoodEnum mood : MoodEnum.values()) {
			map.put(mood.value, mood);
		}
	}

	MoodEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static MoodEnum fromValue(String value) {
		return map.get(value.toLowerCase());
	}
}

// Define MoodAnalyzer class
class MoodAnalyzer {
	public String analyzeMood(String mood) throws MoodAnalysisException {
		// Check if mood is null or empty
		if (mood == null || mood.trim().isEmpty()) {
			throw new MoodAnalysisException("Invalid Mood: Mood cannot be empty or null.");
		}

		// Convert mood to lowercase for case-insensitive comparison
		mood = mood.toLowerCase();

		// Check if mood is valid using Enum
		MoodEnum moodEnum = MoodEnum.fromValue(mood);
		if (moodEnum == null) {
			throw new MoodAnalysisException("Invalid Mood: Mood not recognized.");
		}

		// Return the analyzed mood
		return mood;
	}
}