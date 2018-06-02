package com.maiseenok.seventh_homework.task2;

import java.util.ArrayDeque;

public class Tanker extends Ship {

	Tanker(Port port) {
		p = port;
		box = new ArrayDeque<Box>();
		super.MAXBOXVOLUME = 600;
		super.MAXBOXWEIGHT = 1500;
	}

	@Override
	public void run() {
		name = "Tanker " + Thread.currentThread().getName();
		p.workProcess(this);
	}
}
