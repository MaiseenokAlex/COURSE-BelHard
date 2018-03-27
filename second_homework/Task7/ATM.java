package second_homework.Task7;

public class ATM {
	private int cash20;
	private int cash50;
	private int cash100;

	ATM(int cash20,int cash50,int cash100){
		this.cash20=cash20;
		this.cash50=cash50;
		this.cash100=cash100;
	}
	
	public boolean getMoney(int needSum){
		boolean k=test(needSum);
		if(k)
			return changing(needSum);
		return false;
	}
	
// checking if we can get this sum
	public boolean test(int needSum){
		int sum=cash100*100+cash20*20+cash50*50;
		if(sum<needSum){
			System.out.println("Sorry, our ATM do not have enough money\n"
					+ "Maximum sum = "+sum);
			return false;
		}
				
		if(needSum < 50 && needSum%20 != 0){
			int pos=needSum/20*20;
			System.out.println("\nSorry, impossible to withdraw this sum");
			System.out.println("We can offer you to withdraw "+pos+" or "+(pos+20));
			return false;
		}
		
		if(needSum > sum-50 && needSum%20 != 0){
			int pos=needSum/20*20;
			System.out.println("\nSorry, impossible to withdraw this sum");
			System.out.println("We can offer you to withdraw "+pos+" or "+(pos+20));
			return false;
		}
		
		if(needSum > 50 && needSum%10 != 0){
			int pos=needSum/10*10;
			System.out.println("Sorry, impossible to withdraw this sum");
			System.out.println("We can offer you to withdraw "+pos+" or "+(pos+10));
			return false;
		}
		
		if(getCash50() == 0 || getCash20()<2){
			System.out.println("Sorry, impossible to withdraw this sum");
			return false;
		}
		
		return true;
	}
	
// changing note's amount	
	public boolean changing(int sum){
		int rem=sum%20;
		int counter50=0;
		StringBuilder sb=new StringBuilder();

// checking if note 50 should be 
		if(rem==10){
			counter50=1;
			if(getCash50()>0){
				setCash50(-1);
				sum-=50;
				}
			else{
				System.out.println("Sorry, impossible to withdraw this sum");
				return false;
			}
		}
		
		int copy=sum/100;
		if(copy>getCash100()){
			sb.append(getCash100()+"*100 ");
			sum-=getCash100()*100;
			setCash100(-getCash100());
			copy=sum/50;
			if(copy>getCash50()){
				sb.append((getCash50()+counter50)+"*50 ");
				counter50=0;
				sum-=getCash50()*50;
				setCash50(-getCash50());
			}
			else{
				sum-=copy*50;
				setCash50(-copy);
				if(copy>0){
					sb.append((copy+counter50)+"*50 ");
					counter50=0;
				}
			}
		}
		else{
			sum-=copy*100;
			setCash100(-copy);
			if(copy>0)
				sb.append(copy+"*100 ");
		}
				
		if(sum!=0){
			copy=sum/20;
			if(copy>getCash20()){
				System.out.println("Sorry, impossible to withdraw this sum");
				return false;
			}
			if(counter50!=0)
				sb.append("1*50 ");
			sb.append(copy+"*20");
			setCash20(-copy);
		}
		
		System.out.println("You can take your money");
		System.out.println(sb);
		return true;
	}
	
	public void setCash20(int cash20) {
		this.cash20 += cash20;
	}

	public void setCash50(int cash50) {
		this.cash50 += cash50;
	}

	public void setCash100(int cash100) {
		this.cash100 += cash100;
	}

	public boolean setMoney(int cash20,int cash50,int cash100){
		this.cash20+=cash20;
		this.cash50+=cash50;
		this.cash100+=cash100;
		return true;
	}
	
	@Override
	public String toString() {
		return "cash20=" + cash20 + ", cash50=" + cash50 + ", cash100=" + cash100;
	}

	public int getCash20() {
		return cash20;
	}
	public int getCash50() {
		return cash50;
	}
	public int getCash100() {
		return cash100;
	}
}
