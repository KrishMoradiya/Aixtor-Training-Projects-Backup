package com.Aixtor.Training.Java.Krish_Moradiya.ClassLoader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		s1.setId(25);
		
		System.out.println(s1.getId());
		
		Method methodsOfC1[] = c1.getDeclaredMethods();
		
		for(Method m : methodsOfC1) {
			System.out.println(m);
		}
		
		Field fieldsOfC1[] = c1.getDeclaredFields();
		
		for(Field f : fieldsOfC1) {
			System.out.println(f);
		}
		
		
		System.out.println("\nInterface which implements by Student Class...:\n"+c1.getInterfaces().getClass().getName());

	}

}
