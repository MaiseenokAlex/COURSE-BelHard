package com.maiseenok.third_homework.taskA10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog myDog = new Dog(23.5, "Spike");
		Dog myPuppy = new Puppy(5.2, "Tyke");

		myDog.voice();
		myDog.jump();
		myDog.run();
		myDog.bite();
		System.out.println(myDog + "\n");
		myPuppy.voice();
		myPuppy.jump();
		myPuppy.run();
		myPuppy.bite();
		System.out.println(myPuppy);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream ous = new ObjectOutputStream(baos);
		ous.writeObject(myDog);
		ous.close();

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		Dog newDog = (Dog) ois.readObject();
		System.out.println("\n Dog after serialization: " + newDog);

	}
}
