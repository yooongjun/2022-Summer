package BOJpractice;

import java.util.Scanner;

public class BOJ1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int dp[][] = new int[m+1][n+1];
			for(int j=1; j<m+1; j++) {
				dp[j][1] = j;
				for(int k=2; k<n+1; k++)
				{
					dp[j][k] = dp[j-1][k-1] + dp[j-1][k];
				}
			}
			System.out.println(dp[m][n]);
		}
	}

}
