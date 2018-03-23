package First_homework;

public class Task12 {
public static void main(String[] args) {
	int[] mass=new int[15];
	int min=100,max=-1;
	int sum=0;
	
//random massive filling
		for (int i = 0; i < mass.length; i++) {
			mass[i]=(int)(Math.random()*10+1);
			
//looking for min and max
			if(mass[i]>max){
				max=mass[i];
				}
			if(mass[i]<min){
				min=mass[i];
				}
		}
		
//printing massive
		System.out.print("Massive: ");
		for(int i:mass)
			System.out.print(i+" ");
	System.out.println("\nMin="+min+" Max="+max);
	
	int gate=0; //looking for submassive start.
				//1 - submassive starts with max element
				//2 - submassive starts with min element
	String str=" ";
	for (int i = 0; i < mass.length; i++) {
// if max before min
		if(mass[i]==max){
			switch(gate){
			case 1:	sum=0;   //if meet another max element
					str=" ";
					break;
			case 0: gate=1;  //if submassive starts
					break;
			case 2: gate=1;  //if submassive ends
					str+=mass[i];
					System.out.println("Element sum:"+str+"="+(sum+mass[i]));
					sum=0;
					break;
			}
		}
//if min before max
		if(mass[i]==min){
			switch(gate){
			case 2:	sum=0;   //if meet another max element
					str=" ";
					break;
			case 0: gate=2;  //if submassive starts
					break;
			case 1: gate=2;  //if submassive ends
					str+=mass[i];
					System.out.println("Element sum:"+str+"="+(sum+mass[i]));
					sum=0;
					break;
			}
		}
//maybe we found not submassive
		if(gate!=0){
			sum+=mass[i];
			str+=mass[i]+"+";
			}
	}
}
}
