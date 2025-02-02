package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Set;
import java.util.*;
class TreeSetExample1 {
	public static void main(String[] args) {
		Collection<Integer> treeLst = new TreeSet<>();
		TreeSet<Integer> treeLst2 = new TreeSet<>();
		
		treeLst.add(1);
		treeLst.add(2);
		treeLst.add(1);
		treeLst.add(2);
		treeLst.add(3);
		treeLst.add(48);
		treeLst.add(3587);
		
		System.out.println(treeLst); // not duplication, Ordered: Sorted in ordered
		treeLst2.addAll(treeLst);
		System.out.println(treeLst2); // not duplication, Ordered: Sorted in ordered
		treeLst.clear();
		System.out.println(treeLst); treeLst.addAll(treeLst2);
		
		System.out.println(treeLst.contains(48));
		System.out.println(treeLst.containsAll(treeLst2));
		System.out.println(treeLst.contains(35));
		System.out.println(treeLst.hashCode());
		System.out.println(treeLst.isEmpty());
		
		Iterator i = treeLst.iterator();
		System.out.println("----------------------------------");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------------------------------");
		
		Spliterator l = treeLst.spliterator();
		System.out.println("----------------------------------");
		while(l.tryAdvance((n)->System.out.println(n)));
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		for(Object o: treeLst) {
			System.out.println(o);
		}
		System.out.println("----------------------------------");
		
		Object[] o2 = treeLst.toArray();
		System.out.println(o2[4]);
		
		treeLst.remove(48);
		System.out.println(treeLst);
		
		System.out.println(treeLst2.first());
		System.out.println(treeLst.equals(treeLst2));
		System.out.println(treeLst.equals(treeLst));
	}
}
