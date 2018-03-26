package second_homework;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	boolean b=true;
	char specialLetter=(char)(Math.random()*26+65);
	String c;
	int comp;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Try to guess my special letter from A to Z:");
	do{
		c=sc.next();
		if(c.compareToIgnoreCase("A") >= 0 && c.compareToIgnoreCase("Z") <= 0){
			comp=c.compareToIgnoreCase(String.valueOf(specialLetter));
			if(comp>0)
				System.out.println("You’re too high. Try one more time");
			else if(comp<0)
				System.out.println("You’re too low. Try one more time");
			else {
				System.out.println("My letter is "+specialLetter+". You win!");
				b=false; 
			}
		}
		else
			System.out.println("Incorrect value");
	}while(b);
	sc.close();
}
}
