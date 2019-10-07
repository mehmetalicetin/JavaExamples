/**
 * 
 */
package com.cetin.i2i.insetionsort;

import com.cetin.i2i.util.Printer;

/**
 * @author 7767
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = new int[] { 4, 3, 2, 10, 12, 1, 5, 6 };

		insertionSort(array);

		Printer.printArray(array);

	}

	private static void insertionSort(int[] array) {

		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

}
