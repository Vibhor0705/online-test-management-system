package com.capg.onlinetestapp;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capg.onlinetestapp.dao.UserDaoImp;
import com.capg.onlinetestapp.service.UserServiceImp;
import com.capg.onlinetestapp.entities.*;

public class UserServiceImpTest {
	UserServiceImp service;
	Test t;
	@BeforeEach
	public void setup() {
		service = new UserServiceImp(new UserDaoImp());
	}
	
	
	
	@AfterEach
	public void clear() {
		UserDaoImp.testStore.clear();
	}
	
	
	@Test
	public void addTest_1()
	{
		com.capg.onlinetestapp.entities.Test test = new com.capg.onlinetestapp.entities.Test(BigInteger.valueOf(1),"abc");
		service.addTest(test);
		Map<BigInteger, Test> testStore = new HashMap<>();
		com.capg.onlinetestapp.entities.Test result = new com.capg.onlinetestapp.entities.Test();
		result = (com.capg.onlinetestapp.entities.Test) testStore.get(1);
		Assertions.assertEquals(1,result.getTestId());
		Assertions.assertEquals("abc",result.getTestTitle());
		
	}
	
	
	
}
