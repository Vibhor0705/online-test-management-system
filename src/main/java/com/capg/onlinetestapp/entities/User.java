package com.capg.onlinetestapp.entities;

public class User {
	long userId;
	String userName;
	Test userTest;
	public static boolean isAdmin;
	String userPassword;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Test getUserTest() {
		return userTest;
	}
	public void setUserTest(Test userTest) {
		this.userTest = userTest;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public User(long userId, String userName, Test userTest, boolean isAdmin, String userPassword) {
		this.userId = userId;
		this.userName = userName;
		this.userTest = userTest;
		this.isAdmin = isAdmin;
		this.userPassword = userPassword;
	}
	public User() {
		
	}
	
	

}
