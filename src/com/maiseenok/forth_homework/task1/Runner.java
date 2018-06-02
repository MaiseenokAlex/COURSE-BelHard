package com.maiseenok.forth_homework.task1;

import java.util.Random;

public class Runner {
	public static void main(String[] args) {
		Integer[] mass = new Integer[10];
		for (int i = 0; i < mass.length; i++)
			mass[i] = 1 + new Random().nextInt(9);

		FunctionalInterface intList = new FunctionalImp();
		System.out.println("IntList " + intList.convert(mass));
	}
}
