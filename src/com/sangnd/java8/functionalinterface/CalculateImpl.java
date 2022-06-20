package com.sangnd.java8.functionalinterface;

public class CalculateImpl implements Calculate{

	@Override
	public Integer add(Integer numberOne, Integer numberTwo) {
		return numberOne + numberTwo;
	}

}
