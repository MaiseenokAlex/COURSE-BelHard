package com.maiseenok.fifth_homework.task1;

import java.util.Collection;
import java.util.Random;

public class CollectionMod {
	public static void generate(Collection<Integer> col) {
		Random rand=new Random();
		for (int i = 0; i < 100; i++)
			col.add(rand.nextInt(200));
	}
	
	public static int add(Collection<Integer> col) {
		long time=System.nanoTime();
		col.add(201);
		return (int)(System.nanoTime()-time);
	}
	
	public static int search(Collection<Integer> col, int elem) {
		long time=System.nanoTime();
		col.contains(elem);
		return (int)(System.nanoTime()-time);
	}
	
	public static int remove(Collection<Integer> col, int elem) {
		long time=System.nanoTime();
			col.remove(elem);
		return (int)(System.nanoTime()-time);
	}
}
