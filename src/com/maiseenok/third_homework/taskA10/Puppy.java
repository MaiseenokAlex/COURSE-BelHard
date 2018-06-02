package com.maiseenok.third_homework.taskA10;

public class Puppy extends Dog {
	private static final long serialVersionUID = -1401585853952125992L;

	public Puppy() {
		super();
	}

	public Puppy(double mass, String name) {
		super(mass, name);
	}

	public void voice() {
		System.out.println("Aff-Aff");
	}

	public void bite() {
		System.out.println("кусь");
	}

	@Override
	public String toString() {
		return "small " + super.toString();
	}
}
