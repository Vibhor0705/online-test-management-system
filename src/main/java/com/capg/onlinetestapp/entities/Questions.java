package com.capg.onlinetestapp.entities;

import java.math.*;
import java.util.Arrays;

public class Questions {
	BigInteger questionId;
	String[] questionOptions;
	String questionTitle;
	int questionAnswer;
	BigDecimal questionMarks;
	int chosenAnswer;
	BigDecimal marksScored;
	public Questions(BigInteger questionId, String[] questionOptions, String questionTitle, int questionAnswer,
			BigDecimal questionMarks, int chosenAnswer, BigDecimal marksScored) {
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questions other = (Questions) obj;
		if (chosenAnswer != other.chosenAnswer)
			return false;
		if (marksScored == null) {
			if (other.marksScored != null)
				return false;
		} else if (!marksScored.equals(other.marksScored))
			return false;
		if (questionAnswer != other.questionAnswer)
			return false;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		if (questionMarks == null) {
			if (other.questionMarks != null)
				return false;
		} else if (!questionMarks.equals(other.questionMarks))
			return false;
		if (!Arrays.equals(questionOptions, other.questionOptions))
			return false;
		if (questionTitle == null) {
			if (other.questionTitle != null)
				return false;
		} else if (!questionTitle.equals(other.questionTitle))
			return false;
		return true;
	}
	public Questions() {
		
	}
	public void updateQuestion(BigInteger id, Questions q) {
		
	}
	public BigInteger getQuestionId() {
		return questionId;
	}
	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}
	public String[] getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public BigDecimal getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}
	
}
