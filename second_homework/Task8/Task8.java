package second_homework.Task8;

public class Task8 {
public static void main(String[] args) {
	Kettle device1=new Kettle();
	
	System.out.println("Hot water status: "+device1.isHotWater());
	device1.on();
	device1.off();
	System.out.println("Hot water status: "+device1.isHotWater()+"\n");

	Heater device2=new Heater();
	System.out.println("Temperature is "+Heater.temperature);
	device2.on();
	device2.off();
	System.out.println("Temperature is "+Heater.temperature+"\n");
	
	device2.autoOn();
	Heater.temperature=10;
	device2.autoOn();
	System.out.println("Temperature is "+Heater.temperature);
	
}
}
