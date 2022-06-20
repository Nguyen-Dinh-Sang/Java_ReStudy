package com.sangnd.java8.functionalinterface;

public class FunctionalInterface {

	public void printResult(Calculate calculate) {
		Integer a = 5;
		Integer b = 10;
		System.out.println(calculate.add(a, b));
	}

	public static void main(String[] args) {
		FunctionalInterface functionalInterface = new FunctionalInterface();

		// Traditional way.
		
		functionalInterface.printResult(new Calculate() {

			@Override
			public Integer add(Integer numberOne, Integer numberTwo) {
				return numberOne + numberTwo;
			}
		});
		
		functionalInterface.printResult(new CalculateImpl());
		
		// Lambda
		functionalInterface.printResult((numberOne, numberTwo) -> numberOne + numberTwo);
		
		functionalInterface.printResult(FunctionalInterface::sameFunctionalInterface);
	}
	
	public static Integer sameFunctionalInterface(Integer numberOne, Integer numberTwo) {
		return numberOne * numberTwo;
	}
}
