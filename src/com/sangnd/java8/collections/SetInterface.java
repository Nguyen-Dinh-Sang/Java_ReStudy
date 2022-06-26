package com.sangnd.java8.collections;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		// Unduplicated
		
		//hashSet();
		//enumSet();
		//linkedHashSet();
		treeSet();
	}

	public static void hashSet() {
		Set<Integer> setIntegers = new HashSet<>();
		setIntegers.add(5);
		setIntegers.add(1);
		setIntegers.add(7);
		setIntegers.add(3);

		System.out.println(setIntegers);
		System.out.println("\n");

		setIntegers.add(3);
		setIntegers.add(3);
		setIntegers.add(3);
		
		System.out.println(setIntegers);
		System.out.println("\n");

		setIntegers.add(0);
		setIntegers.add(-3);

		// Data will be sort
		System.out.println(setIntegers);
		System.out.println("\n");
	}
	
	enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
	
	public static void enumSet() {
		Set<Days> enumSetDays = EnumSet.of(Days.TUESDAY, Days.MONDAY, Days.MONDAY);
		
		System.out.println(enumSetDays);
		System.out.println("\n");
		
		enumSetDays.add(Days.FRIDAY);
		System.out.println(enumSetDays);
		System.out.println("\n");
		
		Set<Days> enumSetDays2 = EnumSet.noneOf(Days.class);
		System.out.println(enumSetDays2);
		System.out.println("\n");
		
		Set<Days> enumSetDays3 = EnumSet.allOf(Days.class);
		System.out.println(enumSetDays3);
		System.out.println("\n");
	}
	
	public static void linkedHashSet() {
		// Retain the arrangement when added
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
       
		linkedHashSet.add(5);
		linkedHashSet.add(1);
		linkedHashSet.add(7);
		linkedHashSet.add(9);

        System.out.println(linkedHashSet);
        System.out.println("\n");

        linkedHashSet.add(7);
        linkedHashSet.add(7);
        System.out.println(linkedHashSet);
        System.out.println("\n");

        linkedHashSet.remove(7);
        System.out.println(linkedHashSet);
        System.out.println("\n");
	}
	
	public static void treeSet() {
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(6);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(-1);

		System.out.println(treeSet);
        System.out.println("\n");

        treeSet.add(3);
        treeSet.add(0);
        treeSet.add(0);
        
        // Data will be sort
        System.out.println(treeSet);
        System.out.println("\n");

        System.out.println(((TreeSet<Integer>) treeSet).descendingSet());
        System.out.println("\n");
	}
}
