/**
 * 
 */
package com.cetin.i2i.demo;

import com.cetin.i2i.exception.ArrayException;
import com.cetin.i2iarray.ArrayOps;

/**
 * The class to provide demo array.
 * 
 * @author mehmetali.cetin
 *
 */
public class ArrayDemo {

	/**
	 * demo main maethod.
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[] { 1,2};
				
		try {
			ArrayOps.findMaxArray(array);
		} catch (ArrayException e) {
			System.err.println("Error occured during Array operations : "+e.getFaultCode()+ " -- "+ e.getMessage());
		} catch (Throwable e) {
			System.out.println("Untracked exception :"+e);
		}

	}

}
