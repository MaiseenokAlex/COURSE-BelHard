package com.maiseenok.forth_homework.task3;

public class Student {
	private String name;
	private int course;
	
	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCourse() {
		return course;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
}
