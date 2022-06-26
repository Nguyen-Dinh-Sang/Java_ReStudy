package com.sangnd.java8.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		arrayList();
		linkedList();
		vector();
	}
	
	public static void arrayList() {
		List<String> listAnimal = new ArrayList<>();
		listAnimal.add("Dog");
		listAnimal.add("Cat");
		listAnimal.add("Brear");
		listAnimal.add("Mouse");
		listAnimal.add("Cat");
		
		System.out.println(listAnimal);
		System.out.println("\n");
		
		listAnimal.forEach(System.out::println);
		System.out.println("\n");
		
		Iterator<String> inIterator = listAnimal.iterator();
		inIterator.forEachRemaining(System.out::println);
		System.out.println("\n");
	}
	
	public static void linkedList() {
		// Retain order when added
	}
	
	public static void vector() {
		// Safe with multithreading
	}
}
