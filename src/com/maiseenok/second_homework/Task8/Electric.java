package com.maiseenok.second_homework.Task8;


public abstract class Electric {
	private double mass;
	private int capacity;
	
	abstract public void on();
	abstract public void off();
	
	public double getMass() {
		return mass;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
