package BOJpractice;

import java.util.Scanner;

public class BOJ10844 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();	
		long dp[][] = new long[n+1][10];
		int mod = 1000000000;
		
		for(int i=1; i<10;i++) {
			dp[1][i] = 1;
		}

		for(int i=2;i<n+1;i++) {
			for(int j=0; j<10;j++) {
				if(j==0)
					dp[i][j] = dp[i-1][1]%mod;
				else if(j==9)
					dp[i][j] = dp[i-1][8]%mod;
				else
				dp[i][j] = dp[i-1][j-1]%mod+dp[i-1][j+1]%mod;
			}
		}
		
		long sum=0;
		for(int i=0;i<10;i++) {
			sum+= dp[n][i];
		}
		System.out.println(sum%mod);
	
	
	}

}
