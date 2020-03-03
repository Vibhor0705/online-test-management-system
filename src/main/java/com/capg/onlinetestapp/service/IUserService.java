package com.capg.onlinetestapp.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;

public interface IUserService {
	Test addTest(Test test);
	 Test updateTest(BigInteger testId,Test test);
	 Test deleteTest(BigInteger testId);
	 boolean assignTest(Long userId,BigInteger testId);
	 Questions addQuestions(BigInteger testId,Questions question);
	 Questions updateQuestions(BigInteger testId,Questions question);
	 Questions deleteQuestions(BigInteger testId,Questions question);
	 BigDecimal getResult(Test test);
}
