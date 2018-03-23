package First_homework;

public class Task2 {
public static void main(String[] args) {
	int number=514;
	if(number>99&&number<1000)
		System.out.println(number+" is three-digit;");
	else
		System.out.println(number+" is not three-digit;");
//-----------	
	if(number%10==7)
		System.out.println("The last digit of "+number+" is 7;");
	else
		System.out.println("The last digit of "+number+" is not 7;");
//-----------	
	if(number%2==0)
		System.out.println(number+" is even;");
	else
		System.out.println(number+" is odd;");
}
}
