package com.maiseenok.third_homework.taskB10;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		Sedan sd1 = new Sedan();
		Sedan sd2 = new Sedan(7300, 275, 6.2, 185);
		Minivan mv1 = new Minivan();
		Minivan mv2 = new Minivan(8400, 251, 8.2, 205);

		Taxi[] taxiPark = { sd1, sd2, mv1, mv2 };
		TaxiPark tp = new TaxiPark(taxiPark);
		System.out.println("Total price is " + tp.totalPrice() + "$");
		System.out.println("\nTaxi list with max speed between 250 and 270:");
		tp.diaSpeed(250, 270);
		Arrays.sort(tp.taxiPark);
		System.out.println("\nAfter sort " + tp);
	}
}
