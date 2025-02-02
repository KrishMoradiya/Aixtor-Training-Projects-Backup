package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

import com.sun.jdi.Method;

class ArrayList1 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList2 = new ArrayList<Integer>();
		
//		Add int element in ArrayList which is implements List methodList ..
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList2.add(110);
		intList2.add(120);
		intList2.add(130);
		
		System.out.println("\nInt List 1:");
		//==================  foreach - Loop ==================
		for(int i : intList) {
			System.out.println(i);
		}
		
		System.out.println("\nInt List 2:");
		//==================  foreach - Loop ==================
		for(int i : intList2) {
			System.out.println(i);
		}
		
		intList2.addAll(intList);
		System.out.println("\nAfter add all element of List 1 Int List 2 is:");
		//==================  foreach - Loop ==================
		for(int i : intList2) {
			System.out.println(i);
		}
		
		intList2.addAll(1,intList);
		System.out.println("\nAfter add all element of List 1 in Int List 2 at index 0:");
		//==================  foreach - Loop ==================
		for(int i : intList2) {
			System.out.println(i);
		}
		
		System.out.println();
		List<Object> objectList = new ArrayList<Object>();
		objectList.add("Krish Moradiya");
		objectList.add(1);
		objectList.add(1500.00);
		objectList.add('$');
		objectList.add(true);
		// ==================  foreach - method ==================
		objectList.forEach(value -> {
			System.out.println(value);
		});
		
		System.out.println("\nAfter clear intList2");
		intList2.clear();
		//==================  foreach - Loop ==================
		for(int i=0;i<=intList2.size();i++) {
			if(intList2.isEmpty() == true)
				System.out.println("[]");
			else
				System.out.println(intList2.get(i));
		}
		
		System.out.println("\n\n================================");
		System.out.println("intList : "+intList);
		System.out.println("intList.contains(20) : " + intList.contains(20));
		
		intList2.addAll(intList);
		intList2.add(40);
		intList2.add(50);
		
		System.out.println("\n================================");
		System.out.println("intList : "+intList);
		System.out.println("intList2 : "+intList2);
		System.out.println("intList2.containsAll(intList) : " + intList2.containsAll(intList));
		System.out.println("intList.containsAll(intList2) : " + intList.containsAll(intList2));
		System.out.println("Collections.max(intList2) : "+Collections.max(intList2));
		System.out.println(intList2.size());
		System.out.println(intList2);
		System.out.println("intList2.remove(3) : "+intList2.remove(3)); // shifted one element
		System.out.println("intList2.remove(3) : "+intList2.remove(3));
		System.out.println("intList2.add(40) : "+intList2.add(40)); // append one element
		System.out.println("intList2.add(50) : "+intList2.add(50));
		System.out.println(intList2);
		
		System.out.println("\n================================");
		System.out.println("intList.equals(intList2) : "+ intList.equals(intList2)); // false because of different object
		System.out.println("intList.equals(intList) : "+ intList.equals(intList)); // true because of same object
		
		System.out.println("\n================================");
		System.out.println("intList.hashCode() : "+ intList.hashCode());
		
		System.out.println("============ Iterator Interface ==========");
		Iterator i = objectList.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("============ ListIterator Interface ==========");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("============ ListIterator Interface ==========");
		List<Integer> tempList = new ArrayList<Integer>();
		System.out.println("intList"+intList);
		tempList.addAll(intList);
		System.out.println("tempList :" + tempList);
		System.out.println("intList2 :" + intList2);
		tempList.clear();
		tempList.addAll(intList2);
		System.out.println("intList2.remove(intList) : " + intList2.removeAll(intList));
		System.out.println("intList2 : " + intList2);
		System.out.println("intList2.removeIf(num -> num == 50) : "+intList2.removeIf(num -> num == 50));
		System.out.println("intList2 : " + intList2);
		System.out.println("\n\n===================== Spliterator ================");
		System.out.println("tempList : "+tempList);
		Spliterator<Integer> spliterator = tempList.spliterator();
		System.out.println("tempList is in Spliterator Interface: ");
		while(spliterator.tryAdvance((num) -> System.out.print(num + " ")));
		
		System.out.println("\n\n===================  ListIterator =============");
		ListIterator<Object> l = objectList.listIterator();
		System.out.println("==== hasNext in ListIterator =======");
		while(l.hasNext()) {
			System.out.println(l.next());
			while(l.hasPrevious()) {
				if(l.previous() == "Krish Moradiya") {
					l.set("Hello");
				}
				else {
					l.next();
					break;
				}
			}
		}
		System.out.println(objectList);
		System.out.println("==== hasPrevious in ListIterator =======");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}

		Integer[] listArray = intList.toArray(new Integer[0]);
		System.out.println(listArray);
		
		System.out.println("\n\n"+intList+"\nSum is: "+intList.stream().reduce(0,(x,y)->x+y));
	}
}
