package first_homework;

public class Task13 {
	public static void main(String[] args) {
		int n=9;
		int[][] arr=new int[n][n];	
//matrix filling		
		for(int i=0;i<=n/2;i++)
			for(int j=0;j<=n/2;j++){
				if(i<=j){
					arr[i][j]=arr[n-i-1][n-j-1]=
							arr[i][n-j-1]=arr[n-i-1][j]=1;
					}
			}
//matrix printing		
		for(int[] i:arr){
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
			}
	}
}
