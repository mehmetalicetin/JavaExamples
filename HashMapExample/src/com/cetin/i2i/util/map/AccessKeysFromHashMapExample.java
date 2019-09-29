/**
 * 
 */
package com.cetin.i2i.util.map;

import java.util.HashMap;
import java.util.Map;

/**
 * A class to provide access keys in map.
 * @author mehmetali.cetin
 *
 */
public class AccessKeysFromHashMapExample {

	public static void main(String[] args) {
		Map<String,String> userCityMapping=new HashMap<>();
		
		
		//Check if a HashMap is empty
		System.out.println("is userCityMapping empty? : "+ userCityMapping.isEmpty());
		
		userCityMapping.put("John", "New York");
		userCityMapping.put("Ali", "Istanbul");
		userCityMapping.put("Jane", "Manila");
		
		System.out.println("userCityMapping HasMap : "+userCityMapping);
		
		
		//Find the size of a HashMap
		System.out.println("We have the city information of "+userCityMapping.size()+" users");
		
		String userName="Jane";
		
		// Check if a key exist in the HashMap
		if (userCityMapping.containsKey(userName)) {
			// Get the value assigned to a given key in the hashMap
			String city = userCityMapping.get(userName);
			System.out.println(userName + " lives in " + city);
		} else {
			System.out.println("City details not found for user "+userName);
		}
		
		// check if a value exist in a HashMap
		if(userCityMapping.containsValue("New York")) {
			System.out.println("There is a user in the userCityMapping who lives in New York");
		} else {
			System.out.println("There is not user n the userCityMapping who lives in NewYork");
		}
		
		// Modify the value assigned to an existing key
		userCityMapping.put(userName, "California");
		System.out.println(userName +" moved in  a new city "+userCityMapping.get(userName)+", New userCityMapping : "+userCityMapping);
		
		//The get() method returns "null" if the specified  key was not found in the hashMap
		System.out.println("Lisa's City : "+userCityMapping.get("Lisa"));

	}

}
