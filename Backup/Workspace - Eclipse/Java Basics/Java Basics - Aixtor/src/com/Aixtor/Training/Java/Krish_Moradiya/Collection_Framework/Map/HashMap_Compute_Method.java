package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Map;
import java.util.*;
class HashMap_Compute_Method {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"Krish");
		map.put(2,"Pratik");
		map.put(3,"Man");
		map.put(4,"Darshan");
		map.put(5,"Vivek");
		map.put(6,"Bankit");
		
		System.out.println(map);
		map.compute(1, (k,v)->v.concat(" IT Wallah..."));
		System.out.println(map);
		map.computeIfPresent(1, (k,v)->v.substring(0, 5));
		System.out.println(map);
		
	}
}
