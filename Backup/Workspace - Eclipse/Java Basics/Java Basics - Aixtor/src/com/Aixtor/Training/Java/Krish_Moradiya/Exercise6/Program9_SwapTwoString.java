package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;

class Program9_SwapTwoString {
	public static void main(String[] args) {
		String str1 = "Krish";
		String str2 = "Moradiya";
		
		System.out.println("Before Swap two string...\nFirst String is: "+str1+"\nSecond String is: "+str2);
		
		str1 = str1 + str2;
		
		str2 = str1.substring(0,str1.length()-str2.length());
		
		str1 = str1.substring(str2.length());
		
		System.out.println("\nAfter Swap two string...\nFirst String is: "+str1+"\nSecond String is: "+str2);
		
	}
}
