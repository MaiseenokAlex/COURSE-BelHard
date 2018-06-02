package com.maiseenok.forth_homework.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Runner {

	public static List<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		List<Integer> unionSet = new ArrayList<Integer>();
		unionSet.addAll(set1);
		unionSet.addAll(set2);
		return unionSet;
	}

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> intersectSet = new HashSet<Integer>();
		Iterator<Integer> itSet = set1.iterator();
		while (itSet.hasNext()) {
			int val = itSet.next();
			if (set2.contains(val))
				intersectSet.add(val);
		}

		return intersectSet;
	}

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			set1.add(1 + new Random().nextInt(20));
			set2.add(1 + new Random().nextInt(20));
		}

		System.out.println("Set1: " + set1);
		System.out.println("Set2: " + set2);
		System.out.println("Union set: " + union(set1, set2));
		System.out.println("Intersection set: " + intersect(set1, set2));
	}
}
