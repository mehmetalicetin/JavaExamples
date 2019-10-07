/**
 * 
 */
package com.cetin.i2i.rectangle;

import java.awt.Rectangle;

/**
 * @author scottm
 *
 */
public class ObjectVarsAsParameters {

	
	public static void main(String[] args) {
		go();

	}

	private static void go() {
		Rectangle r1 = new Rectangle(0,0,5,5);
		System.out.println("In method go. r1 " + r1 + "\n");
		// could have been 
		//System.out.prinltn("r1" + r1.toString());
		r1.setSize(10, 15);
		System.out.println("In method go. r1 " + r1 + "\n");
		alterPointee(r1);
		System.out.println("In method go. r1 " + r1 + "\n");
		
		alterPointer(r1);
		System.out.println("In method go. r1 " + r1 + "\n");
		
	}

	private static void alterPointer(Rectangle r1) {
		System.out.println("In method alterPointer. r " + r1 + "\n");
		r1 = new Rectangle(5, 10, 30, 35);
		System.out.println("In method alterPointer. r " + r1 + "\n");
		
	}

	private static void alterPointee(Rectangle r1) {
		System.out.println("In method alterPointee. r " + r1 + "\n");
		r1.setSize(20, 30);
		System.out.println("In method alterPointee. r " + r1 + "\n");
		
	}

}
