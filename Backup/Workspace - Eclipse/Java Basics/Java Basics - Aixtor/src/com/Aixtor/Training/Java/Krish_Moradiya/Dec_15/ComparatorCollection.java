package com.Aixtor.Training.Java.Krish_Moradiya.Dec_15;
import java.util.*;
class ComparatorCollection {
	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10 > o2%10)
					return 1; // for swap
				else
					return -1;
			}
		};
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(12);
		lst.add(73);
		lst.add(3945);
		lst.add(3837);
		Collections.sort(lst);
		System.out.println("Sorting: "+lst);
		Collections.sort(lst,comparator);
		System.out.println("Sorting by last digit: "+lst);
	}
}
