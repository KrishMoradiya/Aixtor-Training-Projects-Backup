package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Map;
import java.util.*;
class LinkedHashMap_Example {
	public static void main(String[] args) {
		int count = 0;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		map.put(0, 210);
		map.put(1, 310);
		map.put(2, 420);
		map.put(3, 500);
		map.put(4, 5000);
		
		Map<Integer,Integer> map2 = new LinkedHashMap<>();
		map2.putAll(map);
		
		System.out.println(map);
		System.out.println(map2);
		
		map.putIfAbsent(4, 1000);
		map.putIfAbsent(5, 1020);
		System.out.println(map);
		
		map.remove(4);
		System.out.println(map);
		map.remove(3,"Dev"); // return true
		System.out.println(map);
		
		for(Integer s: map.values()) {
			System.out.println(s);
		}
		
		System.out.println(map.containsValue("Darshan"));
		System.out.println(map.containsKey(5));
		System.out.println(map.isEmpty());
		
		map.forEach((k,v)->System.out.println("Key is: "+k+" and value is: "+v));
		
		map.replace(2,1050);
		System.out.println("-----------------------------------------");
		map.forEach((k,v)->System.out.println("Key is: "+k+" and value is: "+v));
		
		map.replace(3,500,680);
		System.out.println("-----------------------------------------");
		map.forEach((k,v)->System.out.println("Key is: "+k+" and value is: "+v));
	}
}
