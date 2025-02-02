package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.Map;
import java.util.*;
import com.Aixtor.Training.Java.Krish_Moradiya.Classes.Student;
class TreeMapExample {
	static int id = 0;
	public static void main(String[] args) {
		Map<Integer,Student> map = new TreeMap<Integer,Student>();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("------------------------------------------------");
			System.out.println("Enter 1 if you entered student details...");
			System.out.println("Enter 2 Show All Details...");
			System.out.println("Enter 3 Delete student record...");
			System.out.println("3. Exit");
			ch = sc.nextInt();
			System.out.println("------------------------------------------------");
			switch(ch) {
				case 1:
					Student s = new Student();
					s.setValues();
					map.put(++id,s);
				break;
				case 2:
					map.forEach((k,v) -> {						
						System.out.println("---------------------");
						System.out.println("Key is: "+v.getId());
						System.out.println("Student id is: "+v.getStudentId());
						System.out.println("Student Name is: "+v.getName());
						System.out.println("College name is: "+v.getcollegeName());
						System.out.println("University name is: "+v.getUniversityname());
						System.out.println("Gender: "+v.getGender());
						System.out.println("Age is: "+v.getAge());
					});
				break;
				case 3:
					System.out.println("Enter student id which you delete now: ");
					int id = sc.nextInt();
						map.remove(id);
					break;
				default:
					System.out.println("------------------------------------------------");
			}
			
		}while(ch <= 3);
		
	}
}
