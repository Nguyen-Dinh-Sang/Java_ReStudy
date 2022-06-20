package com.sangnd.java8.defaultmethod.impl;

import com.sangnd.java8.defaultmethod.DBManager;
import com.sangnd.java8.defaultmethod.NewManager;

public class Parallel implements DBManager, NewManager{

	@Override
	public void read() {
		System.out.println("Read");
	}

	@Override
	public void write() {
		System.out.println("Write");
	}

	@Override
	public void log(String message) {
		DBManager.super.log(message);
		NewManager.super.log(message);
	}

}