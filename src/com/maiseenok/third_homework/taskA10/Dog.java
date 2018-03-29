package com.maiseenok.third_homework.taskA10;

public class Dog implements Animal{
	private double mass;
	private String name;
	
	public Dog(){
		mass=0;
		name="noname";
	}
	
	public Dog(double mass,String name){
		this.mass=mass;
		this.name=name;
	}
	
	public void voice() {
		System.out.println("Woof-woof!");
	}

	public void jump() {
		System.out.println("Up in the air");
	}
	
	public void run() {
		System.out.println("I'm fast and furious");
	}
	
	public void bite() {
		System.out.println("Strong bite");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(mass);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (Double.doubleToLongBits(mass) != Double.doubleToLongBits(other.mass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "dog name is " + name +", mass=" + mass;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
