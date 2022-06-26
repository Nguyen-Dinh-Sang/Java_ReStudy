package com.sangnd.java8.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		// hashMap();
		// linkedHashMap();
		treeMap();
	}

	public static void hashMap() {
		Map<Integer, String> mapAnimal = new HashMap<>();
		mapAnimal.put(1, "Cat");
		mapAnimal.put(1, "Dog");
		mapAnimal.put(1, "Cat");
		mapAnimal.put(1, "Cat");

		System.out.println(mapAnimal);
		System.out.println("\n");

		mapAnimal.put(8, "Dog");
		mapAnimal.put(3, "Cat");
		mapAnimal.put(5, "Mouse");

		System.out.println(mapAnimal);
		System.out.println("\n");

		Set<Integer> setKey = mapAnimal.keySet();

		System.out.println(setKey);
		System.out.println("\n");

		Set<Entry<Integer, String>> setEntries = mapAnimal.entrySet();

		setEntries.forEach(System.out::println);
		System.out.println("\n");
	}

	public static void linkedHashMap() {
		// Retain the arrangement when added
		Map<Integer, String> mapAnimal = new LinkedHashMap<>();
		mapAnimal.put(1, "Cat");
		mapAnimal.put(1, "Dog");

		System.out.println(mapAnimal);
		System.out.println("\n");

		mapAnimal.put(8, "Dog");
		mapAnimal.put(3, "Cat");
		mapAnimal.put(5, "Mouse");

		System.out.println(mapAnimal);
		System.out.println("\n");

		Set<Integer> setKey = mapAnimal.keySet();

		System.out.println(setKey);
		System.out.println("\n");

		Set<Entry<Integer, String>> setEntries = mapAnimal.entrySet();

		setEntries.forEach(System.out::println);
		System.out.println("\n");
	}

	public static void treeMap() {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});

		treeMap.put(5, "Ford");
		treeMap.put(1, "Suzuki");
		treeMap.put(7, "Mercedes");
		treeMap.put(4, "Mazda");
		
		System.out.println(treeMap);
		System.out.println("\n");
		
		Map<Integer, String> treeMap2 = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
		treeMap2.put(1, "S");
		treeMap2.put(2, "C");
		treeMap2.put(1, "A");
		treeMap2.put(4, "D");
		treeMap2.put(3, "E");
		
		System.out.println(treeMap2);
		System.out.println("\n");
	}
}
