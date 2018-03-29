package com.maiseenok.third_homework.taskA10;

public class Puppy extends Dog{
	public Puppy(){
		super();
	}
	
	public Puppy(double mass,String name){
		super(mass,name);
	}
	
	public void voice() {
		System.out.println("Aff-Aff");
	}
	
	public void bite() {
		System.out.println("Кусь");
	}
	@Override
	public String toString() {
		return "small " + super.toString();
	}
}
