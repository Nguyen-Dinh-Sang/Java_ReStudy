package com.sangnd.java8.defaultmethod.impl;

import com.sangnd.java8.defaultmethod.DBManager;

public interface OracleManager extends DBManager{
	@Override
	default void log(String message) {
		System.out.println("Oracle Manager log: " + message);
	}
}
