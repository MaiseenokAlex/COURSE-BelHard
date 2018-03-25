package second_homework;

public class Task6 {
public static void main(String[] args) {
	int n=100;
	String str=" ";
	StringBuilder sb=new StringBuilder();
	System.out.println("Program start");

	long mSec=System.nanoTime();	
	for(int i=0;i<n;i++)
		str+="a ";
	System.out.println("String cycle finished after "+
		(System.nanoTime()-mSec)+" nanoseconds");
	
	mSec=System.nanoTime();
	for(int i=0;i<n;i++)
		sb.append("a ");
	System.out.println("StringBuilder cycle finished after "+
		(System.nanoTime()-mSec)+" nanoseconds");
}
}
