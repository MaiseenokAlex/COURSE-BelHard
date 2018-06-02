package com.maiseenok.seventh_homework.task2;

import java.util.Random;

public class SmallContainer extends Box {
	private int weight;
	private int volume;

	public SmallContainer() {
		weight = (new Random().nextInt(100));
		volume = (new Random().nextInt(40));
	}

	public int getWeight() {
		return weight;
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "SmallContainer: weight=" + weight + ", volume=" + volume;
	}
}
