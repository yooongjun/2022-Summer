package BOJpractice;

import java.util.Scanner;

public class BOJ11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int dp[] = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		int n = sc.nextInt();
		
		for(int i=3; i<= n; i++) {
			dp[i] = dp[i-1]%10007 +dp[i-2]%10007;
		}
		
		System.out.println(dp[n]%10007);
		
	}

}
