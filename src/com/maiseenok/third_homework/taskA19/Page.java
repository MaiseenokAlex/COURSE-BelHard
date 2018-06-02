package com.maiseenok.third_homework.taskA19;

public class Page {
	private int pageNumber;
	private Photography[] PhotoList;
	private int counter=0;
	
	public boolean add(Photography photo) {
		if(counter<PhotoList.length) {
			PhotoList[counter++]=photo;
			return true;
		}
		return false;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Photography[] getPhotoList() {
		return PhotoList;
	}

	public void setPhotoList(Photography[] photoList) {
		PhotoList = photoList;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
