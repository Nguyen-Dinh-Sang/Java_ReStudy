package com.sangnd.java8.functional.iinterface;

public class CalculateImpl implements Calculate{

	@Override
	public Integer add(Integer numberOne, Integer numberTwo) {
		return numberOne + numberTwo;
	}

}
