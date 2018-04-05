package com.maiseenok.fifth_homework.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Runner {
public static void main(String[] args) {
	long time=System.currentTimeMillis();
	List<User> ll1=new ArrayList<User>();
	List<User> ll2=new ArrayList<User>();
	for (int i = 0; i < 5000; i++) {
		ll1.add(new User());
		ll2.add(new User());
	}

	List<User> llUnion=new LinkedList<User>();
	for (int i = 0; i < ll1.size(); i++) {
		llUnion.add(ll1.get(i).clone());
	}
	
	llUnion.retainAll(ll2);
	Iterator<User> it=llUnion.iterator();
	int i=0;
	while(it.hasNext())
		System.out.println((i++) +" "+ it.next().toString());
	System.out.println("Code time: "+(System.currentTimeMillis()-time));
}
}
