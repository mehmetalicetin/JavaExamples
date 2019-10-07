/**
 * 
 */
package com.cetin.i2i.insetionsort;

import com.cetin.i2i.util.Printer;

/**
 * A class to provide sorting an array.
 * @author mehmetali.cetin
 *
 */
public class BubleSortApp {

	
	public static void main(String[] args) {
		
		int array[]=new int[] {65,46,89,52,38,2,5658,39,14,33,13,4,24,99,89,77,73,87,36,81};
		
		System.out.println("Before sorting :");
		Printer.printArray(array);
		
		sortBuble(array);
		
		System.out.println("\nAfter sorting :");
		Printer.printArray(array);

	}



	/**
	 * to sort array
	 * @param array
	 */
	private static void sortBuble(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] > array[j]) {

					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}

}
