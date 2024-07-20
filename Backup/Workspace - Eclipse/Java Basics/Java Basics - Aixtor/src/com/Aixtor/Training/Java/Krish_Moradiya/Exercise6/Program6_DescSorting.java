//Write a Program - Bubble sort example
//Topic Cover : Array, pass the reference,bubble sort

package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;

class Program6_DescSorting {
	
	protected static void swap(int[] num,int i,int j) {
		if(num[i] < num[j]) {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
	}
	public static void main(String[] args) {
		int[] numbers = new int[] {41,35,74,21,10};
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				swap(numbers,i,j);
			}
		}
		System.out.println("{41,35,74,21,10} is in Descending order...");
		for(int i: numbers) {
			System.out.println(i);
		}
	}
}