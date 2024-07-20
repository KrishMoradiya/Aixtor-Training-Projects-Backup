package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;

import java.util.Scanner;
import java.util.StringTokenizer;

class Program8_DuplicateCharacter {
	public static void main(String[] args) {
		String s1 = new String();
		StringBuffer duplicateChar = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		s1 = sc.nextLine();
		
		for(int i=0;i<s1.length();i++) {
			int count = 1;
			for(int j=i;j<s1.length();j++) {
				if(i == j)
					continue;
				if(s1.charAt(i) == s1.charAt(j)) {
					count++;
					duplicateChar.append(s1.charAt(i)+",");
					break;
				}
			}
		}
		
		System.out.println("Duplicate character is: ");
		StringTokenizer st = new StringTokenizer(duplicateChar.toString(),",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}
