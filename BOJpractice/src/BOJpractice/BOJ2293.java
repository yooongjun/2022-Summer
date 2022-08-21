package BOJpractice;

import java.util.Scanner;

public class BOJ2293 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int dp[][] =new int[n+1][k+1];
		int coin[] = new int[n+1];
		for(int i=1; i<n+1;i++) {
			coin[i]  = sc.nextInt();	
		}

		dp[0][0] = 1;
		for(int i=1; i<n+1;i++) {
			for(int j=0; j<k+1; j++) {
				
				if(coin[i]<=j) {
				dp[i][j] = dp[i-1][j] + dp[i][j-coin[i]];
				}else {
					dp[i][j] = dp[i-1][j];
					}
				}
		}
		
		System.out.println(dp[n][k]);
		
	}

}
