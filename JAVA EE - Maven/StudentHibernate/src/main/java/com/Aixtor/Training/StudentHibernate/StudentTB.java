package com.Aixtor.Training.StudentHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentTB //POJO 
{
	
	@Id
	private int id;
	private String studentID;
	private String name;
	private String course;
	
	public StudentTB() {}
	
	public StudentTB(int id, String studentID, String name, String course) {
		super();
		this.id = id;
		this.studentID = studentID;
		this.name = name;
		this.course = course;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
