package com.sangnd.java8.functional.iinterface;

public class FunctionalInterface {

	public void printResult(Calculate calculate) {
		Integer a = 5;
		Integer b = 10;
		System.out.println(calculate.add(a, b));
	}

	public static void main(String[] args) {
		FunctionalInterface functionalInterface = new FunctionalInterface();

		functionalInterface.printResult(new Calculate() {

			@Override
			public Integer add(Integer numberOne, Integer numberTwo) {
				return numberOne + numberTwo;
			}
		});
	}
}
