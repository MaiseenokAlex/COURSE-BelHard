package com.maiseenok.fifth_homework.task3;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Runner {
public static void main(String[] args) {
	String str= "Дождь пошел и не проходит,\n" + 
				"Дождь, дождь.\n" + 
				"Дождь идет, хотя не ходит\n" + 
				"Дождь, дождь.\n" + 
				"Он прохожим хлещет в лица,\n" + 
				"Дождь, дождь.\n" + 
				"Долго-долго будет литься\n" + 
				"Дождь, дождь."+
				"Он будет лить часы подряд\n" + 
				"На крышу, на дорогу.\n" + 
				"Об этом тучи  говорят,\n" + 
				"Хоть говорить не могут.";
	String value;
	StringTokenizer st=new StringTokenizer(str, " ,.-\n");
	HashMap<String,Integer> hm=new HashMap<>();
	
	while(st.hasMoreTokens()){
		value=st.nextToken().toLowerCase();
		if(hm.containsKey(value)) 
			hm.put(value, hm.get(value)+1);
		else
			hm.put(value, 1);
	}
	System.out.println(hm);
}
}
