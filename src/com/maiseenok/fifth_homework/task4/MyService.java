package com.maiseenok.fifth_homework.task4;

@Version(ver = 1.0)
public class MyService {
	private String guestName;
	private int rooms;
	private int days;
		
	public MyService() {
		super();
	}

	public MyService(String guestName, int rooms, int days) {
		super();
		this.guestName = guestName;
		this.rooms = rooms;
		this.days = days;
	}

	private void thisClassInfo() {
		System.out.println("Class Name: "+getClass().getSimpleName());
		System.out.println("Fields presence: String guestName, int rooms, int days");
	}
	
	public String getGuestName() {
		return guestName;
	}
	
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + days;
		result = prime * result + ((guestName == null) ? 0 : guestName.hashCode());
		result = prime * result + rooms;
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
		MyService other = (MyService) obj;
		if (days != other.days)
			return false;
		if (guestName == null) {
			if (other.guestName != null)
				return false;
		} else if (!guestName.equals(other.guestName))
			return false;
		if (rooms != other.rooms)
			return false;
		return true;
	}
}
