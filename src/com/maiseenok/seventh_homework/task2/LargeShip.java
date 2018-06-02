package com.maiseenok.seventh_homework.task2;

import java.util.ArrayDeque;

public class LargeShip extends Ship {

	public LargeShip(Port port) {
		p = port;
		box = new ArrayDeque<Box>();
		super.MAXBOXVOLUME = 400;
		super.MAXBOXWEIGHT = 1000;
	}

	@Override
	public void run() {
		name = "Large Ship " + Thread.currentThread().getName();
		p.workProcess(this);
	}
}
