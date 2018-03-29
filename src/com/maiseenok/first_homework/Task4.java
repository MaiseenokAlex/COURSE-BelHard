package com.maiseenok.first_homework;

public class Task4 {
public static void main(String[] args) {
	int money=(int)(Math.random()*1000);
	int digit=money%10;
	
	switch(digit){
	case 1: 
	case 2:
	case 3:
	case 4: if(money%100<5 || money%100>14)
				if(digit==1){
					System.out.println("В кармане "+money+" рубль;");
					break;
				}
				else{
					System.out.println("В кармане "+money+" рубля;");
					break;
				}
	default: System.out.println("В кармане "+money+" рублей;"); break;
	}
}
}
