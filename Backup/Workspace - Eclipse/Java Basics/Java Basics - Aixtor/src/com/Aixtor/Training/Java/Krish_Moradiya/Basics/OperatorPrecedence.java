package com.Aixtor.Training.Java.Krish_Moradiya.Basics;

class OperatorPrecedence {
	public static void main(String[] args) {
		int a = 25;
		int b = 5;
		System.out.println( 25 + 5 - (10-5));
		System.out.println( b-- + 25 + b++ - 10 - 5 );
		System.out.println( --b + 25 + ++b - 10/2 - 5 );
		System.out.println( 25 + 5 - (10-5));
		System.out.println( 25 + 5 - (10-5));
		
		System.out.println(a = 25 / 5 + ++b); // 11 and assign a = 11
		System.out.println(a);
		System.out.println(b);
		
		a = (a > b)?b++:++b;
		System.out.println(a);
	}
}
