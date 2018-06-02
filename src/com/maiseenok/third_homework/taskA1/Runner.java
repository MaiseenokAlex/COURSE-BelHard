package com.maiseenok.third_homework.taskA1;

public class Runner {
	public static void main(String[] args) {
		Word wd1 = new Word("Java", PartOfSpeech.NOUN);
		Word wd2 = new Word("Java", PartOfSpeech.NOUN);
		Word wd3 = new Word("I", PartOfSpeech.PREPOSITION);
		Word wd4 = new Word("Learn", PartOfSpeech.VERB);
		System.out.println("wd1.equals(wd2): " + wd1.equals(wd2));
		System.out.println("wd1.equals(wd3): " + wd1.equals(wd3));
		System.out.println("w4.hashCode(): " + wd4.hashCode());
		System.out.println("wd3.toString(): " + wd3);
		System.out.println();

		Word[] forSTC = { wd3, wd4, wd1 };
		Sentence stc1 = new Sentence(forSTC);
		Sentence stc2 = new Sentence(forSTC);
		System.out.println("stc1.toString(): " + stc1);
		System.out.println("stc1.equals(stc2): " + stc1.equals(stc2));
		System.out.println("stc1.hashCode(): " + stc1.hashCode());
		System.out.println("stc2.hashCode(): " + stc2.hashCode());
		stc1.add(wd2);
		System.out.println("stc1.toString() after adding: " + stc1);
		stc1.remove(1);
		System.out.println("stc1.toString() after removing: " + stc1);
		System.out.println("stc1.equals(stc2): " + stc1.equals(stc2));
		System.out.println();

		Sentence[] forText = { stc1, stc2, stc1 };
		Text tx1 = new Text("My text", forText);
		Text tx2 = new Text("My text", forText);
		System.out.println("tx1.toString(): " + tx1);
		System.out.println("tx1.equals(tx2): " + tx1.equals(tx2));
		System.out.println("tx1.hashCode(): " + tx1.hashCode());
		tx2.setHeader("New Text Header");
		tx2.add(stc2);
		System.out.println("tx2.toString() after adding: " + tx2);
		tx2.remove(stc2);
		System.out.println("tx2.toString() after removing: " + tx2);
	}
}
