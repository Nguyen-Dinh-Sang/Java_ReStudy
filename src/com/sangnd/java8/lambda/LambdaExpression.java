package com.sangnd.java8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
	public static void main(String[] args) {
		Consumer<String> printName = (String name) -> {
			System.out.println(name);
		};
		
		printName.accept("Sang");
		
		// Remove data type of param
		Function<String, String> subString = (stringData) -> {
			return stringData.substring(0, 2);
		};
		System.out.println(subString.apply("123456"));
		
		// Remove (), {}
		Predicate<Integer> isGreaterThan0 = number -> number > 0;
		System.out.println(isGreaterThan0.test(5));
		
		Supplier<Integer> zero = () -> 0;
		System.out.println(zero.get());
		
		Integer index = 100;
		Function<Integer, Integer> addWith100 = number -> number + index;
		
		System.out.println(addWith100.apply(100));
	}
}
