package com.maiseenok.fifth_homework.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class User implements Comparable<User>, Cloneable{
	private String name;
	private int age;
	private Calendar dateOfBirth;
	
	User(){
		Random k=new Random();
		name="";
		for (int i = 0; i <3; i++) {
			name+=(char)(65+k.nextInt(26));			
		}
		age=(k.nextInt(35)+25);
		dateOfBirth=new GregorianCalendar();
		dateOfBirth.add(Calendar.YEAR, -age);
		dateOfBirth.add(Calendar.MONTH, -k.nextInt(12));
		dateOfBirth.add(Calendar.DAY_OF_YEAR, -k.nextInt(30));
	}

	
	public User(String name, int age, Calendar dateOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfBirth=dateOfBirth;
	}


	@Override
	public String toString() {
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
		return "User [name=" + name + ", age=" + age +", date of birth="+
				form.format(dateOfBirth.getTime())+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (age != other.age)
			return false;
//		if (dateOfBirth!=other.dateOfBirth)
//			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(User o) {
		char[] str1=name.toCharArray();
		char[] str2=o.name.toCharArray();
		for (int i = 0; i < Math.min(str1.length, str2.length); i++) {
			if(str1[i]<str2[i])
				return -1;
			if(str1[i]>str2[i])
				return 1;
		}
		if(age<o.age)
			return -1;
		if(age>o.age)
			return 1;
		return 0;
	}
	
	public User clone() {
		return new User(this.name,this.age,this.dateOfBirth);
	}
}
