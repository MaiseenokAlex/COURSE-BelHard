package com.maiseenok.second_homework;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	String str="";
	StringBuilder sb=new StringBuilder();
	System.out.println("Input symbols (input 'quit' to quit):");
	
	do{
		if(str.compareTo("0") >= 0 && str.compareTo("9") <= 0)
			sum+=Integer.parseInt(str);
		else
			sb.append(str);
		str=sc.next();
	}while(!str.equals("quit"));
	
	System.out.println("Sum: " + sum);
	System.out.println("String: " + sb.toString());
	sc.close();
}
}
