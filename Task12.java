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
		
	int gate=0; //looking for submassive start.
				//1 - submassive start with max element,
				//2 - submassive start with min element
	int sum2=0;
	boolean k=false;
	for (int i = 0; i < mass.length; i++) {
// if max before min
		if(mass[i]==max){
			if(gate==1)   //if another max element
				sum2=0;
			if(gate==0){
				gate=1;
				}
			if(gate==2){  //if submassive end
				k=true;
				gate=1;
				sum2+=mass[i];
				}
		}
//if min before max
		if(mass[i]==min){
			if(gate==2)  //if another min element
				sum2=0;
			if(gate==0){
				gate=2;
				}
			if(gate==1){  //if submassive end;
				k=true;
				gate=2;
				sum2+=mass[i];
				}
		}
//when we found submassive
		if(k){
			sum+=sum2;
			sum2=0;
			k=false;
			}
//maybe we found not submassive
		if(gate!=0){
			sum2+=mass[i];
			}
	}
	System.out.println("\nMin="+min+" Max="+max+"\nSum: "+sum);
}
}
