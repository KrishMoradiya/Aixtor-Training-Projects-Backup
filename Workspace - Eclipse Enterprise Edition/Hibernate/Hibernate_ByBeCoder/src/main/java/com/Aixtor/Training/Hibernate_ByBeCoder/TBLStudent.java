package com.Aixtor.Training.Hibernate_ByBeCoder;

public class TBLStudent {
	private int id;
	private String studentID;
	private String name;
	private String course;
	private int semester;
	
	
	
	public TBLStudent(int id, String studentID, String name, String course, int semester) {
		super();
		this.id = id;
		this.studentID = studentID;
		this.name = name;
		this.course = course;
		this.semester = semester;
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
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
}
