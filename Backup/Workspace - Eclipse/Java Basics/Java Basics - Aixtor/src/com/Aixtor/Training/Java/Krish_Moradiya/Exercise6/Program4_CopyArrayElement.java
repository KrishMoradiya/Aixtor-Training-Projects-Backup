package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;

import java.util.Scanner;

class Program4_CopyArrayElement {
	public static void main(String[] args) {
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int newArray[] = new int[10];
		
		System.out.println("Enter 5 Element for First array:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {			
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter 5 Element for Second array:");
		for(int i=0;i<5;i++) {			
			arr2[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			if(i<5) {
				newArray[i] = arr1[i];
			}
			else {
				newArray[i] = arr2[i-5];
			}
		}
		
//		Printing new array
		for(int i: newArray) {
			System.out.print(i + " ");
		}
	}

}
