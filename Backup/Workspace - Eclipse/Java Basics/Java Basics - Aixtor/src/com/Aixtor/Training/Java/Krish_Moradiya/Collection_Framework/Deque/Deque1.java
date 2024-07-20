package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Deque;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Deque;
import java.util.Spliterator;

import com.sun.jdi.Method;

class Deque1 {
	public static void main(String[] args) {
		Deque<String> stringDeque = new ArrayDeque<>();
		Deque<String> stringDeque2 = new ArrayDeque<String>();
		

		stringDeque.add("Krish");
		stringDeque.add("Darshan");
		stringDeque.add("Vivek");
		stringDeque.add("Pratik");
		System.out.println("\nString Deque 1:");
		//==================  foreach - Loop ==================
		System.out.println(stringDeque);
		System.out.println("--------------------------");
		for(String s: stringDeque) {
			System.out.println(s);
		}
		System.out.println();
		stringDeque.forEach((names)->System.out.println(names));
		
		Deque<Number> Deque = new ArrayDeque<>();
		Deque.add(new Integer(25));
		Deque.add(new Float(35.00));
		Deque.add(125);
		
		Deque.forEach((numbers)->System.out.println(numbers));
		System.out.println();
		
		System.out.println("\n\n===================== Spliterator ================");
		Spliterator<String> spliterator = stringDeque.spliterator();
		spliterator.forEachRemaining((name)->System.out.println(name));
		
		System.out.println("\n\n===================== get & element method ================");
		System.out.println(stringDeque.element());
		System.out.println(stringDeque.getLast());
		System.out.println(stringDeque.getFirst());
		stringDeque2.clear();
		System.out.println(stringDeque);
		stringDeque2.addAll(stringDeque);
		System.out.println(stringDeque2);
		
		System.out.println(stringDeque.getClass().getName());
	}
}
