package first_homework;

public class Task11 {
public static void main(String[] args) {
	int[] mass=new int[10];
	int index;
//random massive filling
	for (int i = 0; i < mass.length; i++) {
		mass[i]=(int)(Math.random()*15+1);
	}
//printing massive
	System.out.print("    Massive: ");
	for(int i:mass)
		System.out.print(i+" ");
//massive reverse	
	for (int i = 0; i < mass.length/2; i++) {
		index=mass.length-1-i;
		mass[i]+=mass[index];
		mass[index]=mass[i]-mass[index];
		mass[i]-=mass[index];
	}	
//printing new massive
	System.out.print("\nNew massive: ");
	for(int i:mass)
		System.out.print(i+" ");
}
}
