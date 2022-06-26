package com.sangnd.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SequaltialStream {
	private List<String> listName;
	private List<Integer> listCost;

	public SequaltialStream() {
		listName = new ArrayList<>();
		listName.add("Sang");
		listName.add("Linh");
		listName.add("Hai");
		listName.add("An");
		listName.add("Hieu");

		listCost = new ArrayList<>();
		listCost.add(6);
		listCost.add(5);
		listCost.add(1);
		listCost.add(15);
		listCost.add(53);
	}

	public List<String> filterName(String name) {
		return listName.stream().filter(nameItem -> nameItem.contains(name)).collect(Collectors.toList());
	}

	public List<String> toUpperCase() {
		return listName.stream().map(nameItem -> nameItem.toUpperCase()).collect(Collectors.toList());
	}

	public Integer totalCost() {
		return listCost.stream().reduce((item1, item2) -> item1 + item2).get();
	}

	public void multipleOperation() {
		listName.stream().filter(item -> item.contains("i")).map(String::toUpperCase)
				.sorted((item1, item2) -> item1.compareTo(item2)).forEach(item -> System.out.println(item));
	}

	public static void main(String[] args) {
		SequaltialStream sequaltialStream = new SequaltialStream();

		sequaltialStream.filterName("a").forEach(System.out::println);

		sequaltialStream.toUpperCase().forEach(System.out::println);

		sequaltialStream.multipleOperation();
		
		System.out.println(sequaltialStream.totalCost());
	}
}
