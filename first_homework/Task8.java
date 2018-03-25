package first_homework;

public class Task8 {
public static void main(String[] args) {
	int n=49,i=2;
	String str=" ";
	do{
		if(n%i==0){
			str=" not ";
			break;
			}
	}while(i++<Math.sqrt(n));
	System.out.println("Number "+n+" is"+str+"prime.");
}
}
