package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Set;
import com.Aixtor.Training.Java.Krish_Moradiya.Classes.Student;

import java.util.*;
class HashSetExample_Student {
	public static void main(String[] args) {
		Set<Student> stud = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("------------------------------------------------");
			System.out.println("Enter 1 if you entered student details...");
			System.out.println("Enter 2 Show All Details...");
			System.out.println("3. Exit");
			ch = sc.nextInt();
			System.out.println("------------------------------------------------");
			switch(ch) {
				case 1:
					Student s = new Student();
					s.setValues();
					stud.add(s);
				break;
				case 2:
					stud.forEach(studentData -> System.out.println(studentData));
				break;
				default:
					System.out.println("------------------------------------------------");
			}
			
		}while(ch <= 2);
		
//		System.out.println(s1.toString());
	}
}
