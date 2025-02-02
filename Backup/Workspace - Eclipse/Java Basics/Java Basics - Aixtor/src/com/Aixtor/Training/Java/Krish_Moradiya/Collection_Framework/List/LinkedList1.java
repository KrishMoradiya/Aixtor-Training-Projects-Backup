package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.List;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

import com.sun.jdi.Method;

class LinkedList1 {
	public static void main(String[] args) {
		List<String> stringList = new LinkedList<String>();
		List<String> stringList2 = new LinkedList<String>();
		

		stringList.add("Krish");
		stringList.add("Darshan");
		stringList.add("Vivek");
		stringList.add("Pratik");
		System.out.println("\nString List 1:");
		//==================  foreach - Loop ==================
		System.out.println(stringList);
		System.out.println("--------------------------");
		for(String s: stringList) {
			System.out.println(s);
		}
		System.out.println();
		stringList.forEach((names)->System.out.println(names));
		
		List<Number> list = new LinkedList<>();
		list.add(new Integer(25));
		list.add(new Float(35.00));
		list.add(125);
		
		list.forEach((numbers)->System.out.println(numbers));
		System.out.println();
		
		System.out.println("\n\n===================== Spliterator ================");
		stringList.add(1, "Man");
		Spliterator<String> spliterator = stringList.spliterator();
		spliterator.forEachRemaining((name)->System.out.println(name));
		
		System.out.println("\n\n===================== get method ================");
		System.out.println(stringList.get(3));
		System.out.println(stringList.getLast());
		System.out.println(stringList.getFirst());
		System.out.println("\n\n===================== set method ================");
		stringList.set(1, "Parth");
		System.out.println(stringList);
		System.out.println("\n\n===================== find index method ================");
		System.out.println(stringList.indexOf("Darshan"));
		
		System.out.println("\n\n===================== After sorting method ================");
		stringList2.clear();
		System.out.println(stringList);
		stringList2.addAll(stringList);
		Collections.sort(stringList2);
		System.out.println(stringList2);
		
		System.out.println("\n\n===================== After Copy method ================");
		Collections.copy(stringList2,stringList);
		System.out.println(stringList2);
		
		System.out.println("\n\n===================== After Shuffle method ================");
		Collections.shuffle(stringList2);
		System.out.println(stringList2);
		
		System.out.println("\n\n===================== After reverse method ================");
		Collections.reverse(stringList2);
		System.out.println(stringList2);
		
		System.out.println(stringList2.subList(2, 4));
	}
}
