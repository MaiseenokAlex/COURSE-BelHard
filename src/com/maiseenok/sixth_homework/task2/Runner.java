package com.maiseenok.sixth_homework.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {
public static void main(String[] args) {
	File dir=new File("src/com/kashanok/belhard/lesson9");
	String[] path = dir.list();
	
	File file=new File("catalogList.txt");
	try(FileWriter fos=new FileWriter(file)){
		for (int i = 0; i < path.length; i++) {
			if(path[i].indexOf(".")!=-1) {
				fos.write("файл "+path[i]+"\n");
				System.out.println("файл "+path[i]);
				}
			else {
				fos.write("папка "+path[i]+"\n");
				System.out.println("папка "+path[i]);
				}
		}
	}
	catch(IOException e) {}
}
}
