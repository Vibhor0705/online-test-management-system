package com.capg.onlinetestapp.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.capg.onlinetestapp.dao.IUserDao;
import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;
import com.capg.onlinetestapp.entities.User;
import com.capg.onlinetestapp.exceptions.NotAdminException;
import com.capg.onlinetestapp.exceptions.NotStudentException;


public class UserServiceImp implements IUserService  {
	private IUserDao dao;

	public UserServiceImp(IUserDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Test addTest(Test test) {
		if( User.isAdmin == true) {
			return dao.addTest(test);
		}
		else {
			throw new NotAdminException("Only admin can add test");
			//return test;
		}
	}
	
	@Override
	public Test updateTest(BigInteger testId,Test test) {
		if( User.isAdmin == true) {
			return dao.updateTest(testId, test);
		}
		else {
			throw new NotAdminException("Only admin can update test");
			
		}
	}
	
	@Override
	public  Test deleteTest(BigInteger testId) {
		if( User.isAdmin == true) {
			return dao.deleteTest( testId);
		}
		else {
			throw new NotAdminException("Only admin can delete test");
				
		}
	}
	
	@Override
	public boolean assignTest(Long userId,BigInteger testId) {
		if( User.isAdmin == true) {
			return dao.assignTest(userId, testId);
		}
		else {
			throw new NotAdminException("Only admin can assign test");
		}
	}
	
	@Override
	public Questions addQuestions(BigInteger testId,Questions question) {
		if( User.isAdmin == true) {
			return dao.addQuestions(testId,question);
		}
		else {
			throw new NotAdminException("Only admin can add the questions");
			
		}
	}
	
	@Override
	public  Questions updateQuestions(BigInteger testId,Questions question) {
		if( User.isAdmin == true) {
			return dao.updateQuestions(testId,question);
		}
		else {
			throw new NotAdminException("Only admin can update the questions");
			
		}
	}
	
	@Override
	public Questions deleteQuestions(BigInteger testId,Questions question) {
		if( User.isAdmin == true) {
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
}
