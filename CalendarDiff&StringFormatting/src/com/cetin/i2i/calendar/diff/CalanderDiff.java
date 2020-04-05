/**
 * 
 */
package com.cetin.i2i.calendar.diff;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * @author mehmetali.cetin
 *
 */
public class CalanderDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date("2019/03/29 00:00:00");
		Timestamp timestamp = new Timestamp(date.getTime());

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(timestamp);

		System.out.println("Before add process");
		System.out.println(calendar.getTime());

		System.out.println("after add process");

		calendar.add(Calendar.DAY_OF_MONTH, (12 - 29));
		System.out.println(calendar.getTime());

		/*
		 * System.out.printf("Total coast %d; quantity is %d\n",5,20); //Total coast 5;
		 * quantity is 20
		 * 
		 * System.out.printf("Total coast %10d; quantity is %d\n",5,20); //Total coast
		 * 5; quantity is 20
		 * 
		 * System.out.printf("Total coast %-10d; quantity is %d\n",5,20); //Total coast
		 * 5 ; quantity is 20
		 */
		
		
		//formatting integers
		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d: some text here",i);
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d: some text here\n",i);
		}
		
		
		//formatting floating points
		System.out.printf("Total value %.2f\n",5.6799854);
		System.out.printf("Total value %.1f\n",343.23432343);
		System.out.printf("Total value %-6.1f\n",34364654564.23432343);
		
	}

}
