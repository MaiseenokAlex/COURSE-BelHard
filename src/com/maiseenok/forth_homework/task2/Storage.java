package com.maiseenok.forth_homework.task2;

public class Storage<T> {
	private Object[] mass = new Object[10];
	private int counter;

	public Storage() {
		counter = 0;
	}
	
	public void add(T newElement) {
		if (counter == mass.length) {
			Object[] mass1 = new Object[mass.length * 2];
			for (int i = 0; i < mass.length; i++) {
				mass1[i] = mass[i];
			}
			mass = mass1;
		}
		mass[counter++] = newElement;
	}

	@SuppressWarnings("unchecked")
	public T get(int i) {
		return (T) mass[i];
	}

	@SuppressWarnings("unchecked")
	public T[] getElements() {
		return (T[]) mass;
	}

	@Override
	public String toString() {
		String str = "Storage elements = ";
		for (int i = 0; i < mass.length; i++) {
			str += mass[i] + " ";
		}
		return str;
	}
}
