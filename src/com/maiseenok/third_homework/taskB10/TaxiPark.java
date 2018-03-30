package com.maiseenok.third_homework.taskB10;

public class TaxiPark{
	Taxi[] taxiPark;
	
	public TaxiPark(Taxi[] taxi) {
		taxiPark=taxi;
	}
	
	public int totalPrice() {
		int totalPrice=0;
		for (int i = 0; i < taxiPark.length; i++) {
			totalPrice+=taxiPark[i].getPrice();
		}
		return totalPrice;
	}
	
	public void diaSpeed(int beg, int end) {
		for (int i = 0; i < taxiPark.length; i++) {
			if(taxiPark[i].getMaxSpeed() > beg && taxiPark[i].getMaxSpeed() < end)
				System.out.println(taxiPark[i]);
		}
	}
	
	public void sort() {
		Taxi tmp;
		for (int i = taxiPark.length-1; i >0; i--) {
			for(int j=0;j<i;j++)
				if(taxiPark[j].compareTo(taxiPark[j+1])>0) {
					tmp=taxiPark[j];
					taxiPark[j]=taxiPark[j+1];
					taxiPark[j+1]=tmp;
				}
		}
	}
	
	public String toString() {
		String str="Taxi park contain:\n";
		for (int i = 0; i < taxiPark.length; i++) {
			str+=taxiPark[i]+"\n";
		}
		return str;
	}
}
