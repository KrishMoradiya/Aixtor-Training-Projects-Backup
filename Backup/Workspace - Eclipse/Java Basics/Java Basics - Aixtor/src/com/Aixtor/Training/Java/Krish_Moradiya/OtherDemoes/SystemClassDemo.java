package com.Aixtor.Training.Java.Krish_Moradiya.OtherDemoes;

import java.io.PrintStream;
import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
class SystemClassDemo {
	public static void main(String[] args) {
		
		String s1 = System.out.getClass().getName();
		PrintStream s2 = System.out;
		Class c1 = s2.getClass();
		System.out.println(s1);
		
		Method m1[] = c1.getDeclaredMethods();
		
		for(Method m: m1) {
			System.out.println(m.getReturnType() + " : "+m.getName()+ " : "+m.getModifiers());
		}
	}
}
