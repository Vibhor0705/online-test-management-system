package com.capg.onlinetestapp.service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

import com.capg.onlinetestapp.dao.ITestDao;
import com.capg.onlinetestapp.dao.IUserDao;
import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;

public class TestServiceImp implements ITestService {
	
	private ITestDao dao;
	
	public TestServiceImp(ITestDao dao) {
		this.dao = dao;
	}

	
	@Override
	public
	BigDecimal calculateTotalMarks()
	{
		return dao.calculateTotalMarks();
	}

}
