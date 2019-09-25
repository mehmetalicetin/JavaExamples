/**
 * 
 */
package com.cetin.i2i.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cetin.i2i.watch.StopWatch;

/**
 * A class to provide remove an element in List<?>
 * @author mehmetali.cetin
 *
 */
public class ArrayListIteratorRemove {


	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		StopWatch.start();
		System.out.println("Numbers Removing process started !! ");
		for (int i = 0; i <= 10; i++) {
			numbers.add(i);
		}
		//print numbers before remove 
		System.out.println("Print Number List before removing process !!");
		printNumbers(numbers);
		
		Iterator<Integer> iterator=numbers.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()%2==0) {
				iterator.remove();
			}
		}
		
		//print numbers after removing process.
		printNumbers(numbers);
		
		StopWatch.stop();
		System.out.println("Numbers Removing process ended !! ");
		System.out.println("Elsapsed time :"+StopWatch.time());

	}
	
	
	/**
	 * This method is displayed all numbers.
	 * @param numbers
	 */
	public static void printNumbers(List<Integer> numbers) {
		System.out.println(numbers);
	}

}
