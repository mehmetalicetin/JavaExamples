/**
 * 
 */
package com.cetin.i2i.array;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cetin.i2i.pojo.Employee;

/**
 * A class to provide sort any arrayList by using comparable interface.
 * @author mehmetali.cetin
 *
 */
public class ArrayListSortWithImplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 List<Employee> employees = new ArrayList<>();

	        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
	        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
	        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));

	        System.out.println("Employees (Before Sorting) : \n" + employees);

	        //This will use the 'compareTo()' method of the 'Employee' class to compare two employees and sort them.
	        Collections.sort(employees);
	        
	        System.out.println("Employees (after Sorting) : \n" + employees);

	}

}
