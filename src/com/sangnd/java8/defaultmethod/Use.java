package com.sangnd.java8.defaultmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Use {
	public static void main(String[] args) {
		List<Employee> listEmployees = new ArrayList<>();
		listEmployees.add(new Employee("Sang", 20));
		listEmployees.add(new Employee("Linh", 21));
		listEmployees.add(new Employee("An", 21));
		listEmployees.add(new Employee("Hai", 22));
		listEmployees.add(new Employee("Hieu", 24));

		// Traditional.
		Use use = new Use();
		Collections.sort(listEmployees, use.new SortByAge());
		listEmployees.forEach(System.out::println);

		// Use lambda
		Collections.sort(listEmployees, (employee1, employee2) -> employee2.getAge() - employee1.getAge());
		listEmployees.forEach(System.out::println);

		// Static method
		Collections.sort(listEmployees, Comparator.comparing(Employee::getAge));
		listEmployees.forEach(System.out::println);
		// or
		listEmployees.sort(Comparator.comparing(Employee::getAge).reversed());
		listEmployees.forEach(System.out::println);

		Collections.sort(listEmployees, Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
		listEmployees.forEach(System.out::println);
	}

	class SortByAge implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getAge() - o2.getAge();
		}
	}
}