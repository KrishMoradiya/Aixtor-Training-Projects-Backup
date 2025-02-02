package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Map;
import java.util.*;
class MapExample1 {
	public static void main(String[] args) {
		int count = 0;
		Map<Integer,String> map = new HashMap<>();
		map.put(0, "Krish");
		map.put(1, "Shani");
		map.put(2, "Keval");
		map.put(3, "Dev");
		map.put(4, "Dhruv");
		
		Map<Integer,String> map2 = new HashMap<>();
		map2.putAll(map);
		
		System.out.println(map);
		System.out.println(map2);
		
		map.putIfAbsent(4, "Nivid");
		map.putIfAbsent(5, "Darshan");
		System.out.println(map);
		
		map.remove(4);
		System.out.println(map);
		map.remove(3,"Dev"); // return true
		System.out.println(map);
		
		for(String s: map.values()) {
			System.out.println(s);
		}
		
		System.out.println(map.containsValue("Darshan"));
		System.out.println(map.containsKey(5));
		System.out.println(map.isEmpty());
		
		map.forEach((k,v)->System.out.println("Key is: "+k+" and value is: "+v));
		
		map.replace(2,"Vivek");
		System.out.println("-----------------------------------------");
		map.forEach((k,v)->System.out.println("Key is: "+k+" and value is: "+v));
		
		map.replace(2,"Vivek","Pratik");
		System.out.println("-----------------------------------------");
		map.forEach((k,v)->System.out.println("Key is: "+k+" and value is: "+v));
	}
}
