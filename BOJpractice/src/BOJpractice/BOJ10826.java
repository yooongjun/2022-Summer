package BOJpractice;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10826 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
	
	static BigInteger fib(int n) {
		BigInteger dp[] = new BigInteger[n+2];
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		for(int i=2; i<n+1; i++) {
			dp[i] = dp[i-1].add(dp[i-2]);
		}
		return dp[n];
	}
	
	
}
