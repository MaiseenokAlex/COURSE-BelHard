package com.maiseenok.first_homework;

public class Task5 {
public static void main(String[] args) {
	int n=1630, reserveN=n;
	double newN=0;
	for(int i=3;i>=0;i--){
		newN+=Math.pow(10, i)*(reserveN%10);
		reserveN/=10;
	}
	System.out.println("Reverse of "+n+" is "+(int)newN);
}
}
