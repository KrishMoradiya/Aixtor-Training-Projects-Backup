package com.Aixtor.Training.Java.Krish_Moradiya.Basics;

import java.util.Scanner;

class Calculator{
	public int addition(int a,int b) { return a+b; }
	public int subtraction(int a,int b) { return a-b; }
	public int multiplication(int a,int b) { return a*b; }
	public int division(int a,int b) { return a/b; }
}
class SwitchAndIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		Calculator cal = new Calculator();
		do {
			System.out.println("THIS IS Calculator...");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			System.out.println("Enter Your choice: ");
			ch = sc.nextInt();
			
			if(ch <= 4) {				
				System.out.println("Enter Number 1: ");
				int num1 = sc.nextInt();
				System.out.println("Enter Number 2: ");
				int num2 = sc.nextInt();		
				switch(ch) {
				case 1:
					System.out.println("Sum is: "+cal.addition(num1, num2));
					break;
				case 2:
					System.out.println("Subtraction is: "+cal.subtraction(num1, num2));
					break;
				case 3:
					System.out.println("Multiplication is: "+cal.multiplication(num1, num2));
					break;
				case 4:
					System.out.println("Division is: "+cal.division(num1, num2));
					break;
				default:
					System.out.println("Your choice is wrong...");
				}
			}
		}while(ch<=4);
		
		System.out.println("...");
		
	}
}
