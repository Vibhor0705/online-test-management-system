package com.capg.onlinetestapp.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;

public class TestDaoImp implements ITestDao {
	Questions question;
	@Override
	public BigDecimal calculateTotalMarks() {
	
		
		Test test = new Test();
		Set<Questions> testQuestions = test.getTestQuestions();
		Iterator<Questions> testQuestionIterator = testQuestions.iterator();
		BigDecimal testTotalMarks = new BigDecimal(0);
		while(testQuestionIterator.hasNext())
		{
			Questions nextQuestion = testQuestionIterator.next();
			testTotalMarks = testTotalMarks.add(nextQuestion.getMarksScored());
			test.setTestTotalMarks(testTotalMarks);
		}
		return test.getTestTotalMarks();
		
	}
}
