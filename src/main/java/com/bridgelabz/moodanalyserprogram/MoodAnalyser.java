package com.bridgelabz.moodanalyserprogram;

public class MoodAnalyser {

	private String message; // Field to store the mood message

	// Default constructor
	public MoodAnalyser() {
		message = ""; // Set default empty message
	}

	// Constructor with message parameter
	public MoodAnalyser(String message) {
		this.message = message; // Set the message field with the passed parameter
	}

	// Analysis mood method using the message field
	public String analysisMood() {
		try {
			if (message == null || message.isEmpty()) {
				throw new InvalidMoodException("Invalid mood: Mood message cannot be null or empty.");
			} else if (message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (InvalidMoodException e) {
			// Handle the exception and return "HAPPY" as default value
			System.out.println(e.getMessage());
			return "HAPPY";
		}
	}
}