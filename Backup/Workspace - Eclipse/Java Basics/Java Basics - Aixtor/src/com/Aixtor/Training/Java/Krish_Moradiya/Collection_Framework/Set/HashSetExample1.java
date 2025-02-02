package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Set;
import java.util.*;
class HashSetExample1 {
	public static void main(String[] args) {
		Set<Object> setLst = new HashSet<>();
		Set<Object> setLst2 = new HashSet<>();
		
		setLst.add(1);
		setLst.add("Krish Moradiya");
		setLst.add(null);
		setLst.add(null);
		setLst.add(2);
		setLst.add(1);
		setLst.add("Krish Moradiya");
		setLst.add("Vivek Hapani");
		setLst.add("Aman");
		
		System.out.println(setLst); // not duplication, Ordered: null,int,String, Sorted in ordered
		setLst2.addAll(setLst);
		System.out.println(setLst2); // not duplication, Ordered: null,int,String, Sorted in ordered
		setLst.clear();
		System.out.println(setLst); setLst.addAll(setLst2);
		
		
		
		
		System.out.println(setLst.contains("Krish Moradiya"));
		System.out.println(setLst.containsAll(setLst2));
		System.out.println(setLst.contains("Krish"));
		System.out.println(setLst.hashCode());
		System.out.println(setLst.isEmpty());
		
		Iterator i = setLst.iterator();
		System.out.println("----------------------------------");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------------------------------");
		
		Spliterator l = setLst.spliterator();
		System.out.println("----------------------------------");
		while(l.tryAdvance((n)->System.out.println(n)));
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		for(Object o: setLst) {
			System.out.println(o);
		}
		System.out.println("----------------------------------");
		
		Object[] o2 = setLst.toArray();
		System.out.println(o2[4]);
		
		setLst.remove("Aman");
		System.out.println(setLst);
		
	}
}
