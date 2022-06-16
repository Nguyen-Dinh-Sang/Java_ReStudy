package com.sangnd.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
	private List<Integer> listCost;

	public ParallelStream() {
		listCost = new ArrayList<>();
		listCost.add(6);
		listCost.add(5);
		listCost.add(1);
		listCost.add(15);
		listCost.add(53);
	}
	
	public Integer totalCost() {
		return listCost.parallelStream().reduce(0, Integer::sum);
	}
	
	public static void main(String[] args) {
		ParallelStream parallelStream = new ParallelStream();
		
		System.out.println(parallelStream.totalCost());
	}
}
