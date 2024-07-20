package com.Aixtor.Training.Java.Krish_Moradiya.OtherDemoes;

import java.lang.reflect.*;

public class MethodsOfStrings {
	public static void main(String[] args) {
		String s1 = new String();
		Class c1 = s1.getClass();
		
		System.out.println("\nReturn Type : Method Name : Parameters : Modifiers\n");
		for(Method m1 : c1.getDeclaredMethods()) {
			String methodParameters = m1.getParameterTypes().getClass().getName();
			System.out.println(m1.getReturnType().getName() + " : "+ m1.getName()+" : "+m1.getModifiers() + " : "+methodParameters);
		}
		
	}
}
