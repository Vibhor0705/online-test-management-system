package com.capg.onlinetestapp.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.capg.onlinetestapp.dao.IUserDao;
import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;
import com.capg.onlinetestapp.entities.User;
import com.capg.onlinetestapp.exceptions.NotAdminException;
import com.capg.onlinetestapp.exceptions.*;



public class UserServiceImp implements IUserService  {
	private IUserDao dao;

	public UserServiceImp(IUserDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Test addTest(Test test) {
		//if( User.isAdmin == true) {
			return dao.addTest(test);
		//}
//		else {
//			throw new NotAdminException("Only admin can add test");
//			
//		}
	}
	
	@Override
	public Test updateTest(BigInteger testId,Test test) {
		if( User.isAdmin == true) {
			validatetestId(testId);
			return dao.updateTest(testId, test);
		}
		else {
			throw new NotAdminException("Only admin can update test");
			
		}
	}
	
	@Override
	public  Test deleteTest(BigInteger testId) {
		if( User.isAdmin == true) {
			validatetestId(testId);
			return dao.deleteTest( testId);
		}
		else {
			throw new NotAdminException("Only admin can delete test");
				
		}
	}
	
	@Override
	public boolean assignTest(Long userId,BigInteger testId) {
		if( User.isAdmin == true) {
			validatetestId(testId);
			validateUserId(userId);
			return dao.assignTest(userId, testId);
		}
		else {
			throw new NotAdminException("Only admin can assign test");
		}
	}
	
	@Override
	public Questions addQuestions(BigInteger testId,Questions question) {
		if( User.isAdmin == true) {
			validatetestId(testId);
			validatequestionId( question.getQuestionId());
			return dao.addQuestions(testId,question);
		}
		else {
			throw new NotAdminException("Only admin can add the questions");
			
		}
	}
	
	@Override
	public  Questions updateQuestions(BigInteger testId,Questions question) {
		if( User.isAdmin == true) {
			validatetestId(testId);
			validatequestionId( question.getQuestionId());
			return dao.updateQuestions(testId,question);
		}
		else {
			throw new NotAdminException("Only admin can update the questions");
			
		}
	}
	
	@Override
	public Questions deleteQuestions(BigInteger testId,Questions question) {
		if( User.isAdmin == true) {
			validatetestId(testId);
			validatequestionId( question.getQuestionId());
			return dao.deleteQuestions(testId,question);
		}
		else {
			throw new NotAdminException("Only admin can delete the questions");
			
		}
	}
	
	@Override
	public BigDecimal getResult(Test test) {
		if( User.isAdmin != true) {
			return dao.getResult(test);
		}
		else {
			throw new NotStudentException("Only student can give the test");
			
		}
	}
	
	void validateUserId(long userId) {
		if (userId <= 0) {
			throw new IncorrectIdException("User id is null");
		}
	}
	
	void validatetestId(BigInteger testId) {
		if ( testId.equals(null)) {
			throw new IncorrectIdException("test id is null");
		}
	}
	
	void validatequestionId(BigInteger questionId) {
		if ( questionId.equals(null)) {
			throw new IncorrectIdException("question id is null");
		}
	}
}
