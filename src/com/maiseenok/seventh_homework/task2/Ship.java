package com.maiseenok.seventh_homework.task2;

/*
 * Корабли бывают двух типов: большой корабль и танкер
 * Корабль может загружать контейнеры и разгружать
 * Вместимость корабля ограничена по обьему (MAXBOXVOLUME) и весу(MAXBOXWEIGHT)
 */

import java.util.Queue;

public abstract class Ship implements IShip, Runnable{
	Port p;
	public String name;
	protected int MAXBOXVOLUME;
	protected int MAXBOXWEIGHT;
	Queue<Box> box;
	private int totalBoxVolume;
	private int totalBoxWeight;
	public boolean isFull=false;
	
	@Override
	public boolean loading(Box c) {
		if(totalBoxVolume+c.getVolume() < MAXBOXVOLUME 
				&& totalBoxWeight+c.getWeight() < MAXBOXWEIGHT) {
			box.add(c);
			totalBoxVolume+=c.getVolume();
			totalBoxWeight+=c.getWeight();
			return true;
		}
		System.out.println(this);
		isFull=true;
		return false;
	}

	@Override
	public Box unloading(){
		if(!box.isEmpty()) {
			Box c=box.remove();
			totalBoxVolume-=c.getVolume();
			totalBoxWeight-=c.getWeight();
			isFull=false;
			return c;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return name+" is full now: Total Volume="+totalBoxVolume+", Total Weight="+totalBoxWeight
				+", boxes="+box.size();
	}
	
}
