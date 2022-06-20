package com.sangnd.java8.defaultmethod;

public interface DBManager {
	void read();
	void write();
	
	default void log (String message) {
		System.out.println("Manager log: " + message);
	}
}
