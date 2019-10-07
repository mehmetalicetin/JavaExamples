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
		Date date=new Date("2019/03/29 00:00:00");
		Timestamp timestamp=new Timestamp(date.getTime());
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(timestamp);
		
		System.out.println("Before add process");
		System.out.println(calendar.getTime());
		
		System.out.println("after add process");
		
		calendar.add(Calendar.DAY_OF_MONTH,(12-29));
		System.out.println(calendar.getTime());
		

	}

}
