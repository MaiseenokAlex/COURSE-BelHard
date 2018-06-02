package com.maiseenok.third_homework.taskB10;

public class Sedan extends Taxi {
	Sedan() {
		setPrice(6000);
		setMaxSpeed(260);
		setFuelConsume(7.5);
		setMaxBaggageLoad(150);
	}

	Sedan(int price, int maxSpeed, double fuelConsume, double maxBaggage) {
		setPrice(price);
		setMaxSpeed(maxSpeed);
		setFuelConsume(fuelConsume);
		setMaxBaggageLoad(maxBaggage);
	}

	@Override
	public boolean baggageLoading(double mass) {
		if (mass < getMaxBaggageLoad()) {
			System.out.println("Baggage was loading");
			setMaxBaggageLoad(getMaxBaggageLoad() - mass);
			return true;
		} else
			return false;
	}
}
