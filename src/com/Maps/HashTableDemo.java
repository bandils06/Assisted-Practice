package com.Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	
	public static void main(String[] args) {
		
		Hashtable<Integer, String>  map= new Hashtable<Integer, String>();
		
		
		//not allows null key in the hash table
		//null values are not allowed in hash table
		//insertion order in not maintained
		// printing is done in decending order of key by default.
		
		
		map.put(1, "a");
		map.put(3, "c");
		map.put(2, "b");
		
		
		//map.put(4, null); 
		//map.put(null, "e");
		//map.put(null, null);//both key and value are null
		
		map.put(5, "d");
		
		System.out.println(map); //HashTable prints in decending order of key.
		System.out.println("Get element at key 3: "+map.get(3));
		
		System.out.println("Get element at key 5: "+map.get(5));
		
		System.out.println("Get element at key 8: "+map.get(8));
				
		System.out.println("Get element at key 6: "+map.get(6));//as element is not present it will give you null answer
		
		//remove element by key
		
		map.remove(5);
		
		System.out.println(map);
		
		///iterate using for loop
		
		for(Map.Entry m: map.entrySet()) {
			
			System.out.println(m.getKey()+" , "+m.getValue());
		}		
		
		
		
		
	}
}