package com.maiseenok.second_homework.task8;

public class Heater extends Electric {
	static double temperature = 20;

	public Heater() {
		setMass(13.5);
		setCapacity(1400);
		System.out.println("We've got a new heater!");
	}

	public void autoOn() {
		if (temperature < 15) {
			System.out.println("It's too cold!");
			on();
			off();
		} else
			System.out.println("Room temperature is " + temperature + ". No need to power on");
	}

	@Override
	public void on() {
		System.out.println("Heater is on!");
		temperature = 25;
	}

	@Override
	public void off() {
		System.out.println("Heater is off!");
	}

}
