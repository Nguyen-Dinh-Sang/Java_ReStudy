package com.sangnd.java8.defaultmethod.impl;

import com.sangnd.java8.defaultmethod.DBManager;

public interface MongoDBManager extends DBManager{
	 void log(String message);
}
