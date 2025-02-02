package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Map;
import java.util.*;
class MapExample_Comparing_Descending {
	public static void main(String[] args) {
		Map<String,Integer> map = new TreeMap<>();
		map.put("First", 1);
		map.put("Second", 2);
		map.put("Third", 3);
		map.put("Fourth", 4);
		map.put("Fifth", 5);
		
		
//		=================comparingByKey() in Descending Order Using Comparator Class=====================
		map.forEach((k,v)->System.out.println("Key is: "+k+" and value is: "+v));
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//		=================comparingByKey() in Descending Order Using ArrayList Class=====================
		Set s = map.keySet();
		List<String> list = new ArrayList<String>();
		list.addAll(s);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println("Key is: "+list.get(i)+" and Value is: "+map.get(list.get(i)));
		}

	}
}
