package com.maiseenok.fifth_homework.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
public static void main(String[] args) {
	String[] names= {"LinkedList Add ","ArrayList Add ","HashSet Add ", "TreeSet Add ",
			"LinkedList Search ","ArrayList Search ","HashSet Search ", "TreeSet Search ",
			"LinkedList Remove ","ArrayList Remove ","HashSet Remove ", "TreeSet Remove "};
	List<Integer> ll=new LinkedList<>();
	CollectionMod.generate(ll);
	List<Integer> al=new ArrayList<>();
	CollectionMod.generate(al);
	Set<Integer> hs=new HashSet<>();
	CollectionMod.generate(hs);
	Set<Integer> ts=new TreeSet<>();
	CollectionMod.generate(ts);
	
	@SuppressWarnings("unchecked")
	HashMap<Integer, Collection<Integer>>[] data=new HashMap[12];
	for (int i = 0; i < data.length; i++) {
		data[i]=new HashMap<>();
	}
	HashMap<String, HashMap<Integer, Collection<Integer>>> map=new HashMap<>();
	
	data[0].put(CollectionMod.add(ll),ll);
	data[1].put(CollectionMod.add(al),al);
	data[2].put(CollectionMod.add(hs),hs);
	data[3].put(CollectionMod.add(ts),ts);
	for (int i = 0; i < 4; i++) {
		map.put(names[i], data[i]);		
	}
	
	data[4].put(CollectionMod.search(ll,201),ll);
	data[5].put(CollectionMod.search(al,201),al);
	data[6].put(CollectionMod.search(hs,201),hs);
	data[7].put(CollectionMod.search(ts,210),ts);
	for (int i = 4; i < 8; i++) {
		map.put(names[i], data[i]);		
	}
	
	data[8].put(CollectionMod.remove(ll,201),ll);
	data[9].put(CollectionMod.remove(al,201),al);
	data[10].put(CollectionMod.remove(hs,201),hs);
	data[11].put(CollectionMod.remove(ts,201),ts);
	for (int i = 8; i < 12; i++) {
		map.put(names[i], data[i]);		
	}
	
	for (Entry<String, HashMap<Integer, Collection<Integer>>> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + entry.getValue());
	}
}
}
