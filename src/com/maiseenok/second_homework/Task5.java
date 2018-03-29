package com.maiseenok.second_homework;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task5 {
public static void main(String[] args) {
//	String text="I read all this books.";
//	System.out.println(text);

	System.out.println("Input your text:");
	Scanner sc=new Scanner(System.in);
	String text=sc.nextLine();
	StringTokenizer st=new StringTokenizer(text, " ");
	System.out.println("Text has "+st.countTokens()+" words");
	sc.close();
}
}
