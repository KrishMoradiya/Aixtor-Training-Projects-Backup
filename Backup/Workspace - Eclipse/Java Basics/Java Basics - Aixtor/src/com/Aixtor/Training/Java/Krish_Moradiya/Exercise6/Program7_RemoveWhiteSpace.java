package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;

import java.util.Scanner;

class Program7_RemoveWhiteSpace {
	public static void main(String[] args) {
		String s1 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String with white space:");
		s1 = sc.nextLine();
		
		System.out.println("String is edited and remove white space...");
		System.out.println(s1.trim());
	}
}
