package com.sangnd.java8.defaultmethod.impl;

import com.sangnd.java8.defaultmethod.DBManager;

public class MySQL implements DBManager{

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(String message) {
		System.out.println("MySQL log: " + message);
		DBManager.super.log(message);
	}
}
