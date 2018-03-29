package com.maiseenok.third_homework.taskA1;

import java.util.Arrays;

//while we don't know Collections
public class Sentence{
	private Word[] words;

	public Sentence(Word[] words) {
		this.words = words;
	}
	
	public void add(Word newWord) {
		Word[] wd=new Word[words.length+1];
		for (int i = 0; i < words.length; i++) {
			wd[i]=words[i];
		}
		wd[words.length]=newWord;
		words=wd;
	}
	
	public boolean remove(int position) {
		if(words.length<position) {
			System.out.println("Value is too large");
			return false;
		}
		Word[] wd=new Word[words.length-1];
		for (int i = 0,j=0; i < words.length; i++) {
			if(i!=position)
				wd[j++]=words[i];
		}
		words=wd;
		return true;
	}
	
	public boolean remove(Word delWord) {
		boolean res=false;
		int count=0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(delWord)) {
				count++;
				res=true;
				}
		}
		if(res) {
			Word[] wd=new Word[words.length-count];
			for (int i = 0,j=0; i < words.length; i++) {
				if(!words[i].equals(delWord))
					wd[j++]=words[i];
			}
			words=wd;
		}
		return res;
	}
	
	public Word[] getWords() {
		return words;
	}

	public void setWords(Word[] words) {
		this.words = words;
	}

	@Override
	public int hashCode() {
		final int prime = 2;
		int result = 1;
		for (int i = 0; i < words.length; i++) {
			result+=prime*words[i].hashCode();
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (!Arrays.equals(words, other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str=" ";
		for (int i = 0; i < words.length; i++) {
			str+=" "+words[i].getWord();
		}
		str+=".";
		return str.trim();
	}
	
	
}
