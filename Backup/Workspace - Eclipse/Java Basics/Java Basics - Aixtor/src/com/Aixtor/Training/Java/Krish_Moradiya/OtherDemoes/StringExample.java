package com.Aixtor.Training.Java.Krish_Moradiya.OtherDemoes;

public class StringExample {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String("Hello2");
		String s4 = new String("Hello2");
		
		String s5 = "Hello";
		String s6 = "Krish";
		String s7 = "Krish Moradiya";
		String s8 = "Krish Moradiya";
		
		
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2.hashCode());
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3.hashCode());
		System.out.println("s4: "+s4.hashCode());
		
		System.out.println("\ns5: "+s5.hashCode());
		System.out.println("s6: "+s6.hashCode());
		System.out.println("s7: "+s7.hashCode());
		System.out.println("s8: "+s8.hashCode());
		
		s6 = "Krish Moradiya";
		
		System.out.println("\ns6: "+s6.hashCode());
		System.out.println("s8: "+s8.hashCode());
		
		s6 = "Krish";
		
		System.out.println("s6: "+s6.hashCode());
		
		s6.concat(" Moradiya");
		
		System.out.println("\ns6: "+s6.hashCode());
		
		System.out.println(s1 == s2);
		System.out.println(s7 == s8);
		System.out.println(s1.equals(s2));
		System.out.println(s7.equals(s8));
		
		
		
	}
}
