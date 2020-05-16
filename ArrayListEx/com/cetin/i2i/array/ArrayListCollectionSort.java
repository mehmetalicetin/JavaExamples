
package com.cetin.i2i.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class to provide a sample sort of ArrayList. List is sorted by using
 * Collections.sort(List) method
 * 
 * @author mehmetali.cetin
 *
 */
public class ArrayListCollectionSort {


	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 100; i > 0; i--) {
			numbers.add(i);
		}
		
		toString(numbers); // display numbers.
		
		//Collections.sort(numbers); // sort numbers.

		numbers.sort((num1, num2) -> num1.compareTo(num2));

		toString(numbers); // display numbers.

	}
	
	
	/**
	 * Default toString method. Show list.
	 * @param values
	 */
	public static void toString(List<Integer> values) {
		System.out.println(values);
	}

}
