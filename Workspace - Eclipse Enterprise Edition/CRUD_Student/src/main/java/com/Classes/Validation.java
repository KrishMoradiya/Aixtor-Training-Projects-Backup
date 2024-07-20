package com.Classes;
import java.util.List;

import com.Classes.*;

public class Validation {
	
	public boolean isValidStudentWithID(Student student) {
		if(student == null) {
			return false;
		}
		else {
			if(Integer.toString(student.getId()) != null && student.getName() != null && student.getEmail() != null && student.getMobile() != null && student.getPassword() != null) 
				return true;
			else if(Integer.toString(student.getId()).equals("") && student.getName().equals("") && student.getEmail().equals("") && student.getMobile().equals("") && student.getPassword().equals(""))
				return false;
			else
				return true;
		}
	}
	public boolean isValidStudent(Student student) {
		if(student == null) {
			return false;
		}
		else {
			if(student.getName() != null && student.getEmail() != null && student.getMobile() != null && student.getPassword() != null) 
				return true;
			else if(student.getName().equals("") && student.getEmail().equals("") && student.getMobile().equals("") && student.getPassword().equals(""))
				return false;
			else
				return false;
		}
	}
	public boolean isValidStudentList(List<Student> list) {
		if(list.isEmpty() || list == null)
			return false;
		else
			return true;
	}
}
