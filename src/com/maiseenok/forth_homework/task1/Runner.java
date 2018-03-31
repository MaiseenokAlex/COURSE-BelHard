package com.maiseenok.forth_homework.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Runner {
	public static void main(String[] args) {
	Function<Integer[],List<Integer>> convert = x -> Arrays.asList(x);		

	Integer[] mass=new Integer[10];
	for (int i = 0; i < mass.length; i++)
		mass[i]=1+new Random().nextInt(9);
	
	List<Integer> intList=convert.apply(mass);
	System.out.println("IntList "+intList);
}
}
