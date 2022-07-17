package BOJpractice;

import java.util.Scanner;

public class BOJ1463 {
	static int cnt=0;
	static int dp[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];   
		for (int i=2; i<=n;i++) {
			dp[i] = dp[i-1]+1;
			
			if(i%2 ==0)
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			if(i%3==0)
				dp[i] = Math.min(dp[i], dp[i/3]+1);
		}			
			
		System.out.println(dp[n]);

	}
}
