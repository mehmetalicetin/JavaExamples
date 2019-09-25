/**
 * 
 */
package com.cetin.i2i.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cetin.i2i.pojo.Person;

/**
 * A class to provide sort person list.
 * 
 * @author mehmetali.cetin
 *
 */
public class ArrayListOjectSort {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();

		// created 5 new person
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();

		// existing person information is filled in.
		person1.setName("A");
		person1.setAge((short) 1);

		person2.setName("B");
		person2.setAge((short) 2);

		person3.setName("C");
		person3.setAge((short) 3);

		person4.setName("D");
		person4.setAge((short) 4);

		person5.setName("E");
		person5.setAge((short) 5);

		personList.add(person5);
		personList.add(person3);
		personList.add(person2);
		personList.add(person4);
		personList.add(person1);

		// Display personal listesi before sort.
		printPersonList(personList);

		// Sort people by their age java 1.8
		personList.sort((p1, p2) -> {
			return p1.getAge() - p2.getAge();
		});

		// A more concise way of writing the above sorting function
		personList.sort(Comparator.comparing(Person::getAge));

		// You can also sort using Collections.sort() method by passing the custom
		// Comparator
		Collections.sort(personList, Comparator.comparing(Person::getAge));

		personList.sort(new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		
		// Display personal listesi after sort.
		printPersonList(personList);

		   // CreateArrayListFromCollectionExample.java
		/*
		 * List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		 * firstFivePrimeNumbers.add(2); firstFivePrimeNumbers.add(3);
		 * firstFivePrimeNumbers.add(5); firstFivePrimeNumbers.add(7);
		 * firstFivePrimeNumbers.add(11);
		 * 
		 * // Creating an ArrayList from another collection List<Integer>
		 * firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		 * 
		 * 
		 * List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		 * nextFivePrimeNumbers.add(13); nextFivePrimeNumbers.add(17);
		 * nextFivePrimeNumbers.add(19); nextFivePrimeNumbers.add(23);
		 * nextFivePrimeNumbers.add(29);
		 * 
		 * // Adding an entire collection to an ArrayList
		 * firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		 * 
		 * System.out.println(firstTenPrimeNumbers);
		 */

	}

	/**
	 * This method to provide display all personal in List
	 * 
	 * @param personList
	 */
	public static void printPersonList(List<Person> personList) {
		System.out.println("\n---------------------------------- &&  -------------------------------\n");
		for (Person person : personList) {
			System.out.println("Person : name : " + person.getName() + "  age :" + person.getAge());
		}
	}

}
