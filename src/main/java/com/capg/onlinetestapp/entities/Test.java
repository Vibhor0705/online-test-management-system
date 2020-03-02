package com.capg.onlinetestapp.entities;

import java.math.*;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Test {
	BigInteger testId;
	String testTitle;
	LocalTime testDuration;
	Set<Questions> testQuestion = new HashSet<>();
	BigDecimal testTotalMarks;
	BigDecimal testMarksScored;
	public Test(BigInteger testId, String testTitle, LocalTime testDuration, Set<Questions> testQuestion,
			BigDecimal testTotalMarks, BigDecimal testMarksScored, Questions currentQuestion, LocalTime startTime,
			LocalTime endTime) {
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestion = testQuestion;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.currentQuestion = currentQuestion;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Test() {
	
	}
	public BigInteger getTestId() {
		return testId;
	}
	public void setTestId(BigInteger testId) {
		this.testId = testId;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public LocalTime getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(LocalTime testDuration) {
		this.testDuration = testDuration;
	}
	public Set<Questions> getTestQuestion() {
		return testQuestion;
	}
	public void setTestQuestion(Set<Questions> testQuestion) {
		this.testQuestion = testQuestion;
	}
	public BigDecimal getTestTotalMarks() {
		return testTotalMarks;
	}
	public void setTestTotalMarks(BigDecimal testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}
	public BigDecimal getTestMarksScored() {
		return testMarksScored;
	}
	public void setTestMarksScored(BigDecimal testMarksScored) {
		this.testMarksScored = testMarksScored;
	}
	public Questions getCurrentQuestion() {
		return currentQuestion;
	}
	public void setCurrentQuestion(Questions currentQuestion) {
		this.currentQuestion = currentQuestion;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	Questions currentQuestion;
	LocalTime startTime;
	LocalTime endTime;
	
	
}
