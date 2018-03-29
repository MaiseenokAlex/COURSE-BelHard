package com.maiseenok.third_homework.taskA10;

public class TaskA10 {
	public static void main(String[] args) {
		Dog myDog=new Dog(23.5, "Spike");
		Dog myPuppy= new Puppy(5.2,"Tyke");
		
		myDog.voice();
		myDog.jump();
		myDog.run();
		myDog.bite();
		System.out.println(myDog+"\n");
		myPuppy.voice();
		myPuppy.jump();
		myPuppy.run();
		myPuppy.bite();
		System.out.println(myPuppy);
	}
}
