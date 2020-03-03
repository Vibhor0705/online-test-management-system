package com.capg.onlinetestapp.entities;

public class AssignUserTest {
	private User user;
	private Test test;
	public AssignUserTest(User user, Test test) {
		this.user = user;
		this.test = test;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
}
