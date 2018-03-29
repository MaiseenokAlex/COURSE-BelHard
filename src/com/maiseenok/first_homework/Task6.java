package com.maiseenok.first_homework;

public class Task6 {
public static void main(String[] args) {
	int n=2667,reserveN=n;
	int[] digArr=new int[4];
	String str=" don't ";
	
//putting digits into massive
	for(int i=0;i<digArr.length;i++){
		digArr[i]=reserveN%10;
		reserveN/=10;
	}
	
	for(int i=0;i<digArr.length-1;i++){
		for (int j = i+1; j < digArr.length; j++) {
			if(digArr[i]==digArr[j]){
				str=" ";
				}
		}
	}
	System.out.println("Number "+n+str+"has equal digits");
}
}
