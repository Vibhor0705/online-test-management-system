package com.capg.onlinetestapp.entities;

import java.math.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Test {
	BigInteger testId;
	String testTitle;
	LocalTime testDuration;
	Set<Questions> testQuestions = new HashSet<>();
	BigDecimal testTotalMarks;
	BigDecimal testMarksScored;
	
	public Test() {
		
	}
	public Test(BigInteger testId, String testTitle, LocalTime testDuration, Set<Questions> testQuestions,
			BigDecimal testTotalMarks, BigDecimal testMarksScored, Questions currentQuestion, LocalDateTime startTime,
			LocalDateTime endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.currentQuestion = currentQuestion;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Test(BigInteger testId, String testTitle) {
		// TODO Auto-generated constructor stub
		this.testId = testId;
		this.testTitle = testTitle;
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
	public Set<Questions> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(Set<Questions> testQuestion) {
		this.testQuestions = testQuestion;
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
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	Questions currentQuestion;
	LocalDateTime startTime;
	LocalDateTime endTime;
	
	
}
