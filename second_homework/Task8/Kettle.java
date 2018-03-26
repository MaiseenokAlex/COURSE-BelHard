package second_homework.Task8;

public class Kettle extends Electric{
	private boolean hotWater;
	
	public Kettle() {
		setMass(2.1);
		setCapacity(1800);
		hotWater=false;
		System.out.println("We've got a new kettle!");
	}
	
	@Override
	public void on() {
		System.out.println("Kettle is on!");
	}

	@Override
	public void off() {
		hotWater=true;
		System.out.println("Kettle os off!");
	}

	public boolean isHotWater() {
		return hotWater;
	}

}
