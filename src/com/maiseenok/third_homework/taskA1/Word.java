package com.maiseenok.third_homework.taskA1;

public class Word{
	private String word;
	private PartOfSpeech pos;
	
	public Word(String word, PartOfSpeech pos) {
		this.word = word;
		this.pos = pos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 3;
		char[] c1 = word.toCharArray();
		char[] c2 = pos.name().toCharArray();
		int result = 1;
		for (int i = 0; i < c1.length; i++) {
			result+=prime*(int)c1[i];
		}
		for (int i = 0; i < c2.length; i++) {
			result+=(int)c2[i];
		}
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Word wd=(Word) obj;
		if(word == wd.word && pos==wd.pos)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return word+" - "+pos;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public PartOfSpeech getPos() {
		return pos;
	}

	public void setPos(PartOfSpeech pos) {
		this.pos = pos;
	}

}
