package com.maiseenok.seventh_homework.task2;

import java.util.Random;

public class LargeContainer extends Box {
	private int weight;
	private int volume;

	public LargeContainer() {
		weight = (new Random().nextInt(200)) + 100;
		volume = (new Random().nextInt(60)) + 40;
	}

	public int getWeight() {
		return weight;
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "LargeContainer: weight=" + weight + ", volume=" + volume;
	}
}
