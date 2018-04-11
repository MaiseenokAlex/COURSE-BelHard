package com.maiseenok.sixth_homework.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Runner {
public static void main(String[] args){
	Random rand=new Random();
	File file=new File("numbers.txt");
	
	try(FileOutputStream fos=new FileOutputStream(file); 
						FileInputStream fis=new FileInputStream(file)){
	for (int i = 0; i < 20; i++) {
		fos.write(rand.nextInt(30));
	}
	
	for (int i = 0; i < 20; i++) {
		System.out.print(fis.read()+" ");
	}
	
	}
	catch(IOException e) {
		System.out.println("IOException was detected!");
		e.printStackTrace();
	}
}
}
