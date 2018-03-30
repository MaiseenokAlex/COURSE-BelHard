package com.maiseenok.third_homework.taskB10;

public abstract class Taxi implements Comparable<Taxi>{
	private int price;
	private int maxSpeed;
	private double fuelConsume;
	private double maxBaggageLoad;
	
	public double getMaxBaggageLoad() {
		return maxBaggageLoad;
	}

	public void setMaxBaggageLoad(double maxBaggageLoad) {
		this.maxBaggageLoad = maxBaggageLoad;
	}

	public boolean pickUp() {
		return true;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int compareTo(Taxi o) {
		if(this.fuelConsume<o.fuelConsume)
			return -1;
		if(this.fuelConsume>o.fuelConsume)
			return 1;
		else 
			return 0;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getFuelConsume() {
		return fuelConsume;
	}

	public void setFuelConsume(double fuelConsume) {
		this.fuelConsume = fuelConsume;
	}
	
	public String toString() {
		return getClass().getName()+" [price: "+getPrice()+", max speed: "
	+getMaxSpeed()+", fuel consume:"+getFuelConsume()+", max baggage load: "+getMaxBaggageLoad()+"]";
	}
	
	public void start() {
		System.out.println("Trip was started");
	}
	
	public void finish() {
		System.out.println("Trip was started");
	}
	
	public abstract boolean baggageLoading(double mass);
}
