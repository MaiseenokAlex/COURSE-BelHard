package com.maiseenok.forth_homework.task2;

import java.util.ArrayList;
import java.util.List;

public class Storage <T>{
	private List<T> elements;

	public Storage() {
		elements=new ArrayList<>();
	}
	
	public void add(T newElement) {
		elements.add(newElement);
	}
	
	public T get(int i) {
		return elements.get(i);
	}
	
	public List<T> getElements() {
		return elements;
	}
	
	@Override
	public String toString() {
		return "Storage elements=" + elements;
	}
}
