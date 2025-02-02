/*          ....Definition
 "Write a program - Palindrome number Algorithm
1.Get the number to check for palindrome
2. Hold the number in temporary variable
3. Reverse the number
4. Compare the temporary number with reversed number
5. If both numbers are same, print ""palindrome number""
6. Else print ""not palindrome number"""

create a static method which returns int reversenumber.
Topic Cover: Static, method, if-else, relational operator, Scanner class, Access specifier


 */

package com.Aixtor.Training.Java.Krish_Moradiya.Exercise6;

import java.util.*;

class Program1_Palindrome {
	
	private static int getReverseNumber(int number) {
		int reverseNumber = 0;
		while(number != 0) {
			int remainder = number % 10;
			reverseNumber = (reverseNumber*10)+remainder;
			number /= 10;
		}
		return reverseNumber;
	}
	
	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		number = sc.nextInt();
		
		int tempNumber = number;
		int reverseNumber = getReverseNumber(number);
		
		System.out.println("Reverse Number is: "+reverseNumber);
		
		if(reverseNumber == number) {
			System.out.println("palindrome number");
		}
		else
			System.out.println("not palindrome number");
	}
}
