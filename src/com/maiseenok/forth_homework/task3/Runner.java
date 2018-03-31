package com.maiseenok.forth_homework.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Runner {
	
	public static void printStudents(List<Student> students, int course){
		Iterator<Student> studIterator=students.iterator();
		while(studIterator.hasNext()) {
			Student stud=studIterator.next();
			if(stud.getCourse()==course)
				System.out.println(stud);
		}
	}
	
public static void main(String[] args) {
	List<Student> students=new ArrayList<>();
	for (int i = 1; i < 11; i++) 
		students.add(new Student("Student "+i, 1 + new Random().nextInt(4)));
	
	for (int j = 0; j < 10; j++)
		System.out.println(students.get(j));		
	System.out.println();
	printStudents(students, 3);
}
}
