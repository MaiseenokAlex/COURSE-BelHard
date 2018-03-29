package com.maiseenok.second_homework.Task3;

import java.util.Scanner;

// возникли проблмы с зыкрытием сканера внутри конструктора

public class Task3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Circle cr1=new Circle(sc);
	Circle cr2=new Circle(sc);
	System.out.println("First circle circumference: "+cr1.lengh());
	System.out.println("Distance between two circles: "+cr1.distance(cr2));
	
	if(cr1.touching(cr2))
		System.out.println("Circles have a point of contact");
	else
		System.out.println("Circles don't have a point of contact");
	
	cr2.randomMove();
	System.out.println("New circle position is ("+cr2.getX()+", "+cr2.getY()+")");
	sc.close();
}
}
