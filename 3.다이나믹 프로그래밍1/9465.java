
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		
		for(int k=0;k<t;k++) {
			int n=scan.nextInt();
			long dp[][]=new long[2][n+1];
			int arr[][]=new int[2][n+1];
			
			
			
			for(int i=0;i<2;i++) {
				for(int j=1;j<=n;j++) {
					arr[i][j]=scan.nextInt();
				}
			}
			dp[0][1]=arr[0][1];
			dp[1][1]=arr[1][1];
			for(int i=2;i<=n;i++) {
				dp[0][i]+=Math.max(dp[1][i-1], dp[1][i-2])+arr[0][i];
				dp[1][i]+=Math.max(dp[0][i-1],dp[0][i-2])+arr[1][i];
			}
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}

		
		

	}
	
}
