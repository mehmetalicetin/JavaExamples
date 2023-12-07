/**
 * 
 */
package com.cetin.i2iarray;



import com.cetin.i2i.constant.IArrayConstant.ErrorFaultCode;
import com.cetin.i2i.constant.IArrayConstant.ErrorMessage;
import com.cetin.i2i.exception.ArrayException;

/**
 * ArrayOps class to provide simple operations over an Array.
 * 
 * @author mehmetali.cetin
 *
 */
public class ArrayOps {

	/**
	 * to find max value in array.
	 * @param array
	 * @return
	 * @throws ArrayException
	 */
	public static int findMaxArray(int[] array) throws ArrayException {
		int max = 0;
		if (array.length < 1)
			throw new ArrayException(ErrorFaultCode.LENGTH_FAULT_CODE,"  --> [findMaxArray(int[] array)] "+ErrorMessage.ARRAY_LENGTH_ERROR);

		try {
			for (int i = 0; i < array.length; i++) {
				max = array[i];
				if (max < array[i]) {
					max = array[i];
				}else {
					throw new ArrayException(" else exception "); //girer.
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayException(" ArrayIndexOutOfBoundsException ");

		}

		return max;
	}

	/**
	 * to find min value in array.
	 * @param array
	 * @return
	 * @throws ArrayException
	 */
	public static int findMinArray(int[] array) throws ArrayException {
		int min = 0;

		if (array.length < 1) {
			throw new ArrayException(ErrorFaultCode.LENGTH_FAULT_CODE,"  --> [findMaxArray(int[] array)] "+ErrorMessage.ARRAY_LENGTH_ERROR);
		}
		min = array[0];
		for (int index : array) {
			if (index < min) {
				min = index;
			}
		}
		return min;
	}

	/**
	 * to show elements in array.
	 * @param array
	 * @throws ArrayException
	 */
	public static void printArray(int[] array) throws ArrayException {
		if (array.length < 1) {
			throw new ArrayException(ErrorFaultCode.LENGTH_FAULT_CODE,"  --> [findMaxArray(int[] array)] "+ErrorMessage.ARRAY_LENGTH_ERROR);
		}

		for (int index : array) {
			System.out.println("Array :" + index);
		}

	}
	
	/**
	 * to get total elements value.
	 * @param array
	 * @return
	 * @throws ArrayException
	 */
	public static int getTotalInArray(int[] array) throws ArrayException {
		int total=0;
		if (array.length < 1) {
			throw new ArrayException(ErrorFaultCode.LENGTH_FAULT_CODE," --> [findMaxArray(int[] array)] "+ErrorMessage.ARRAY_LENGTH_ERROR);
		}
		
		for (int index : array) {
			total+=index;
		}
		
		return total;
	}
	
	/**
	 * to get average elements value.
	 * @param array
	 * @return
	 * @throws ArrayException
	 */
	public static double getAverageInArray(int []array) throws ArrayException {
		double avg=0;
		int size=array.length;
		if (size < 1) {
			throw new ArrayException(ErrorFaultCode.LENGTH_FAULT_CODE," --> [findMaxArray(int[] array)] "+ErrorMessage.ARRAY_LENGTH_ERROR);
		}
		
		int total=getTotalInArray(array);
		
		avg=total / size;
		
		return avg;
	}
	
	/**
	 * To show a specified range between start and end. 
	 * @param array
	 * @param start
	 * @param end
	 * @throws ArrayException
	 */
	public static void printRangeArray(int[]array,int start,int end) throws ArrayException {
		int size=array.length;
		if (size < 1) {
			throw new ArrayException(ErrorFaultCode.LENGTH_FAULT_CODE," --> [findMaxArray(int[] array)] "+ErrorMessage.ARRAY_LENGTH_ERROR);
		}
		
		for (int i = start; i <= end && 0 <= i && i< array.length ; i++) {
			System.out.println("Elements :"+array[i]);			
		}
	}

}
