package com.sangnd.java8.defaultmethod;

public interface NewManager {
	void read();
	void write();
	
	default void log (String message) {
		System.out.println("New Manager log: " + message);
	}
}
