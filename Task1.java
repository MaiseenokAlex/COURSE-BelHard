package First_homework;

public class Task1 {
	public static void main(String[] args) {
		int time=4505034;
		int sec=time%60;
		int min=time/60;
		System.out.println("Task A) "+time+" seconds is: "+min+
				" minutes and "+sec+" seconds;");
//----------------		
		int hour=min/60;
		min%=60;
		System.out.println("Task B) "+time+" seconds is: "+hour+" hours, "+min+
				" minutes and "+sec+" seconds;");
//----------------		
		int day=hour/24;
		hour%=24;
		System.out.println("Task C) "+time+" seconds is: "+day+" days, "+hour+
				" hours, "+min+" minutes and "+sec+" seconds;");
//----------------		
		int week=day/7;
		day%=7;
		System.out.println("Task D) "+time+" seconds is: "+week+" weeks, "+day+
				" days, "+hour+" hours, "+min+" minutes and "+sec+" seconds;");
	}
}
