package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;
import java.util.*;

import com.Aixtor.Training.Java.Krish_Moradiya.Exercise6.Program2_BubbleSort;
class Program3_BinarySearch {
	private static int getIndexOfElement(int[] arr,int l,int h,int number) {
		
		if(l<=h) {
			int m = (l+h)/2;
			if(arr[m] == number)
				return m;
			
			if(arr[m] > number)
				return getIndexOfElement(arr, l, m-1, number);
			
			return getIndexOfElement(arr, m+1, h, number);
				
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {41,82,74,21,47,1,9,900};
		int atElement = -1;
		
		
//		For Sorting
		Program2_BubbleSort sort = new Program2_BubbleSort();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sort.swap(arr, i, j);
			}
		}
		for(int i: arr) {
			System.out.println(i);
		}
		
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number which search in directories...");
			int number = sc.nextInt();
			
			atElement = getIndexOfElement(arr, 0, arr.length, number);
			
			if(atElement != -1)
				System.out.println("Element is present at index of "+atElement);
			else
				System.out.println("Element is not present");
		}
	}
}
