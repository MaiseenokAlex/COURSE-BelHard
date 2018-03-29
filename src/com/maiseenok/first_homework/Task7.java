package com.maiseenok.first_homework;

public class Task7 {
public static void main(String[] args) {
	int n=10;
	int fact=1;
	if(n>9 && n<16){
		for (int i = 2; i <= n; i++) {
			fact*=i;
		}
		System.out.println(n+"!="+fact);
	}
	else
		System.out.println("Incorrect value!");
}
}
