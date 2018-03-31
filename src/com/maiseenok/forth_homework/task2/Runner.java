package com.maiseenok.forth_homework.task2;

import java.util.Random;

public class Runner {
public static void main(String[] args) {
	Storage<Integer> intStorage=new Storage<Integer>();
	for (int i = 0; i < 10; i++) {
		intStorage.add(new Random().nextInt(20));
	}
	System.out.println(intStorage);
	
	Storage<Double> doubleStorage=new Storage<Double>();
	for (int i = 0; i < 10; i++) {
		doubleStorage.add(new Random().nextDouble()*20);
	}
	System.out.println(doubleStorage);
	
	Storage<String> stringStorage=new Storage<String>();
	for (int i = 0; i < 10; i++) {
		stringStorage.add("string " + i);
	}
	System.out.println(stringStorage);
}
}
