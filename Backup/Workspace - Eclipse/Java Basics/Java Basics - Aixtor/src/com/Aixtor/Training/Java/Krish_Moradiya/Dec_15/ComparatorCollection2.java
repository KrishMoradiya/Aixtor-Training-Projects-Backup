package com.Aixtor.Training.Java.Krish_Moradiya.Dec_15;
import java.util.*;
class ComparatorCollection2 {
	public static void main(String[] args) {
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					if(o1.charAt(0) > o2.charAt(0))
						return 1; // for swap
					else
						return -1;
				}
				if(o1.length() > o2.length())
					return 1; // for swap
				else
					return -1;
			}
		};
		List<String> lst = new ArrayList<String>();
		lst.add("Man");
		lst.add("Vivek");
		lst.add("Darshan");
		lst.add("Krish");
		lst.add("Pratik");
		lst.add("Nivid");
		Collections.sort(lst);
		System.out.println("Sorting by character: "+lst);
		Collections.sort(lst,comparator);
		System.out.println("Sorting by length of the string: "+lst);
	}
}
