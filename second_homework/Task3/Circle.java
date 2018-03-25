package second_homework.Task3;

import java.util.Scanner;

public class Circle {
	private int x;
	private int y;
	private double r;

	public Circle(Scanner sc) {
		System.out.println("Input parameters");
		System.out.print("Radius (double): ");
		r=sc.nextDouble();
		System.out.print("x-coordinate: ");
		x=sc.nextInt();
		System.out.print("y-coordinate: ");
		y=sc.nextInt();
		System.out.println("\n");
	}
	
	public double lengh(){
		return 2*r*Math.PI;
	}
	
	public void randomMove(){
		x=(int)(Math.random()*200-100);
		y=(int)(Math.random()*200-100);
	}
	
	public double distance(Circle circle){
		return Math.hypot(x-circle.getX(), y-circle.getY());
	}
	
	public boolean touching(Circle circle){
		double dist=distance(circle);
		if(r+circle.getR()==(int)dist)
			return true;
		if(Math.abs(r+circle.getR())==dist)
			return true;
		return false;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getR() {
		return r;
	}
}
