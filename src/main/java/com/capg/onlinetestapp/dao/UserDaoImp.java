package com.capg.onlinetestapp.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;

public class UserDaoImp implements IUserDao {
	
	private Map<BigInteger,Test>testStore=new HashMap<>(); 
	
	@Override
	public Test addTest(Test test) {
		testStore.put(test.getTestId(),test);
		return test;
	}
	
	@Override
	public Test updateTest(BigInteger testId,Test test) {
		
		Test test1 = testStore.put(test.getTestId(), test);
		return test1;
	}
	
	@Override
	public  Test deleteTest(BigInteger testId) {
		
		 testStore.remove(testId);
		
		 return (Test) testStore;
		
	}
	
	@Override
	public  boolean assignTest(Long userId,BigInteger testId) {
		
		
		return true;
	}
	
	@Override
	public Questions addQuestions(BigInteger testId,Questions question) {
		
		return question;
	}
	
	@Override
	public Questions updateQuestions(BigInteger testId,Questions question) {
		
		return question;
	}
	
	@Override
	public Questions deleteQuestions(BigInteger testId,Questions question) {
		
		return question;
	}
	
	@Override
	public  BigDecimal getResult(Test test) {
		
		BigDecimal b = null;
		return b;
	}
	
}
