package com.Aixtor.Training.Java.Krish_Moradiya.Classes;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Student {
	private static int incrementalID = 0;
	private int id = 0;
	private int studentId;
	private String name;
	private int age;
	private String gender;
	private final static String universityName = "Charusat University";
	private String collegeName;
	
	public Student(){
		++incrementalID;
		id = incrementalID;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentId=" + studentId + ", name=" + name + ", age=" + age + ", gender="
				+ gender + ", collegeName=" + collegeName + ", UniversityName="+universityName+"]";
	}
	
	public static String getUniversityname() {
		return universityName;
	}
	public int getId() {
		return id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getcollegeName() {
		return collegeName;
	}
	public void setcollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	Scanner sc = new Scanner(System.in);
	public void setValues() {
		System.out.println("Enter Student ID:");
		studentId = sc.nextInt();
		System.out.println("Enter Age:");
		age = sc.nextInt();
		System.out.println("Enter Gender:");
		gender = sc.next();
		
		System.out.println("Enter your Name:");
		name = sc.next();
		System.out.println("Enter College Name:");
		collegeName = sc.next();
	}
}
