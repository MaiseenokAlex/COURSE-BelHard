package first_homework;

public class Task12 {
public static void main(String[] args) {
	int n=15;
	int[] mass=new int[n];
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
//creating massive with min, max element positions
	int[] minArr=new int[n];
	int[] maxArr=new int[n];
	int arg1=0,arg2=0;
	for (int i = 0; i < mass.length; i++) {
		if(mass[i]==min){
			minArr[arg1++]=i;
		}
		if(mass[i]==max){
			maxArr[arg2++]=i;
		}
	}

	String str=" ";
	for (int i = 0; i < arg1; i++) {
		for(int j = 0; j < arg2; j++){
			if(minArr[i]<maxArr[j]){   // if min before max
				for(int k=minArr[i];k<maxArr[j];k++){
					sum+=mass[k];
					str+=mass[k]+"+";
				}
				str+=mass[maxArr[j]];
				System.out.println("Element sum:"+str+"="+(sum+mass[maxArr[j]]));
				str=" ";
				sum=0;
			}
			else{					  // if max before min
				for(int k=maxArr[j];k<minArr[i];k++){ 
					sum+=mass[k];
					str+=mass[k]+"+";
				}
				str+=mass[minArr[i]];
				System.out.println("Element sum:"+str+"="+(sum+mass[minArr[i]]));
				str=" ";
				sum=0;
			}
		}
	}
}
}
