package com.maiseenok.third_homework.taskA1;

import java.util.Arrays;

public class Text {
	private String header;
	private Sentence[] content;
	
	public Text(String header, Sentence[] content) {
		this.header=header;
		this.content=content;
	}

	public void add(Sentence newSTC) {
		Sentence[] stc=new Sentence[content.length+1];
		for (int i = 0; i < content.length; i++) {
			stc[i]=content[i];
		}
		stc[content.length]=newSTC;
		content=stc;
	}
	
	public boolean remove(int position) {
		if(content.length<position) {
			System.out.println("Value is too large");
			return false;
		}
		Sentence[] stc=new Sentence[content.length-1];
		for (int i = 0,j=0; i < content.length; i++) {
			if(i!=position)
				stc[j++]=content[i];
		}
		content=stc;
		return true;
	}
	
	public boolean remove(Sentence delSTC) {
		boolean res=false;
		int count=0;
		for (int i = 0; i < content.length; i++) {
			if(content[i].equals(delSTC)) {
				count++;
				res=true;
				}
		}
		if(res) {
			Sentence[] stc=new Sentence[content.length-count];
			for (int i = 0,j=0; i < content.length; i++) {
				if(!content[i].equals(delSTC))
					stc[j++]=content[i];
			}
			content=stc;
		}
		return res;
	}
	
	@Override
	public int hashCode() {
		final int prime = 2;
		int result = 1;
		for (int i = 0; i < content.length; i++) {
			result+=prime*content[i].hashCode();
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
		Text other = (Text) obj;
		if (!Arrays.equals(content, other.content))
			return false;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str=header+"\n";
		for (int i = 0; i < content.length; i++) {
			str+=content[i]+" ";
		}
		return str;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Sentence[] getContent() {
		return content;
	}

	public void setContent(Sentence[] content) {
		this.content = content;
	}
	
}
