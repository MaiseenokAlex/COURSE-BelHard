package first_homework;

public class Task10 {
public static void main(String[] args) {
	int[] marks=new int[15];
	int max=0;
//random matrix filling	
	for (int i = 0; i < marks.length; i++) {
		marks[i]=(int)(Math.random()*8+3);
	}
//printing massive
		System.out.print("Marks: ");
		for(int i:marks)
			System.out.print(i+" ");
//looking for max value
	for (int i = 0; i < marks.length; i++) {
		if(marks[i]>max)
			max=marks[i];
	}
//printing max value position
	System.out.print("\nMax mark has position number: ");
	for (int i = 0; i < marks.length; i++){
		if(marks[i]==max)
			System.out.print(i+" ");
	}
	
	System.out.println("\nFirst mark: "+marks[0]);
	System.out.println("Last mark: "+marks[marks.length-1]);
}
}
