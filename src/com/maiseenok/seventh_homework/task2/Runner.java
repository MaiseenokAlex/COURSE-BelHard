package com.maiseenok.seventh_homework.task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
public static void main(String[] args) throws InterruptedException {
	Port p=new Port();
	ExecutorService executor = Executors.newFixedThreadPool(10);
	for(int i=0;i<5;i++) {
		executor.execute(new LargeShip(p));
		executor.execute(new Tanker(p));
	}
	
	executor.shutdown();
	while(!executor.isTerminated()) {
		Thread.sleep(1000);
	}
	System.out.println("Port was closed");
}
}
