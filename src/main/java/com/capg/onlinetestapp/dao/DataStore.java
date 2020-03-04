package com.capg.onlinetestapp.dao;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;
import com.capg.onlinetestapp.entities.User;

public class DataStore {
	static public Map<BigInteger, Test> testStore = new HashMap<BigInteger, Test>();
	static public Map<Long, User> userStore = new HashMap<Long, User>();

	public static void add(Test test) {
		testStore.put(test.getTestId(), test);
	}

	public static Test getTestById(BigInteger id) {
		Test test = testStore.get(id);
		return test;
	}

}
