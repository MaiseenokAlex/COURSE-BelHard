package com.maiseenok.fifth_homework.task4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
public static void main(String[] args) throws NoSuchMethodException,
								SecurityException, InstantiationException, IllegalAccessException, 
								IllegalArgumentException, InvocationTargetException {
	if(MyService.class.isAnnotationPresent(Version.class)) {
		Constructor<MyService> construct=MyService.class.getConstructor();
		MyService ms=construct.newInstance();
		
		Method[] methods=MyService.class.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if(methods[i].getName().equals("setGuestName")) {
				Method m = methods[i];
				m.setAccessible(true);
				m.invoke(ms, "Ivanov");
			}
			if(methods[i].getName().equals("setRooms")) {
				Method m = methods[i];
				m.setAccessible(true);
				m.invoke(ms, 3);
			}
			if(methods[i].getName().equals("setDays")) {
				Method m = methods[i];
				m.setAccessible(true);
				m.invoke(ms, 10);
			}
		}
		for (int i = 0; i < methods.length; i++) {
			if(methods[i].getName().equals("thisClassInfo")) {
				Method m = methods[i];
				m.setAccessible(true);
				m.invoke(ms, null);
			}
		}
	}
}
}
