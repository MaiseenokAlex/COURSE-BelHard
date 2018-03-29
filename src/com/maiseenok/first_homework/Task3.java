package com.maiseenok.first_homework;

public class Task3 {
public static void main(String[] args) {
	int a=4,b=3;
	double r=2.5;
	System.out.println("a="+a+", b="+b+"\nr="+r);
	double diag=Math.hypot(a, b);
	if(2*r<diag)
		System.out.println("You can't cover this rectangle with the round;");
	else
		System.out.println("You can cover this rectangle with the round;");
}
}
