package BOJpractice;

import java.util.Scanner;

public class BOJ9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n[] = new int[T];
		
		for(int i=0; i<T; i++) {
			n[i] = sc.nextInt();
			int dp[] = new int[n[i]+1];
			if(n[i]>=3) {
				dp[1] = 1;
				dp[2] = 2;
				dp[3] = 4;
				for(int j=4; j<=n[i]; j++) {
					dp[j] = dp[j-1]+ dp[j-2] + dp[j-3];
				}
				System.out.println(dp[n[i]]);
			}else {
				for(int j=1;i<=n[i];j++) {
					dp[j] = j;
				}
				System.out.println(dp[n[i]]);
			}
		
		
		}
		
		
		
		
	}

}
