package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;

import java.util.Scanner;

class Program5_DuplicateArrayElement {
	public static void main(String[] args) {
		int arr1[] = new int[10];
		System.out.println("Enter 10 Element array:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {			
			arr1[i] = sc.nextInt();
		}
		
//		print duplicate number
		for(int i=0;i<10;i++) {
			int count = 1;
			for(int j=i;j<10;j++) {
				if(i == j)
					continue;
				if(arr1[i] == arr1[j]) {
					count++;
					System.out.println(arr1[i]+" ");
					break;
				}
			}
		}
	}
}
