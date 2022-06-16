package com.sangnd.java8.functional.iinterface;
import java.lang.FunctionalInterface;

@FunctionalInterface
public interface Calculate {
	// With interface default access modifiers is public
	Integer add(Integer numberOne, Integer numberTwo);
}
