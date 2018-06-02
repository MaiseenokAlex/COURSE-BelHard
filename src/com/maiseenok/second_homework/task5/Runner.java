package com.maiseenok.second_homework.task5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Runner {
public static void main(String[] args) {
	System.out.println("Input your text:");
	Scanner sc=new Scanner(System.in);
	String text=sc.nextLine();
	StringTokenizer st=new StringTokenizer(text, " ");
	System.out.println("Text has "+st.countTokens()+" words");
	sc.close();
}
}
