package BOJpractice;

import java.util.Scanner;

public class BOJ9461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		int arr[] = new int[T+1];
		
		for(int i=1;i<arr.length;i++)
			arr[i]= sc.nextInt();
		long dp[] = new long[101];
		dp[1]= 1; 
		dp[2]= 1;
		dp[3]= 1;
		dp[4]= 2;
		dp[5]= 2;

		for(int i=6;i<dp.length;i++) {
			dp[i]= dp[i-1]+dp[i-5];
		}
		
		
		for(int i=1;i<arr.length;i++)
			System.out.println(dp[arr[i]]);
		
		sc.close();
	}

}
