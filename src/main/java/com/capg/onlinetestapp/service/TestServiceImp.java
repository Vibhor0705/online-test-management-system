package com.capg.onlinetestapp.service;

import java.math.BigDecimal;

import com.capg.onlinetestapp.dao.ITestDao;
import com.capg.onlinetestapp.dao.IUserDao;

public class TestServiceImp implements ITestService {
	
	private ITestDao dao;
	
	public TestServiceImp(ITestDao dao) {
		this.dao = dao;
	}

	@Override
	public BigDecimal calculateTotalMarks() {
		return dao.calculateTotalMarks();
	}

}
