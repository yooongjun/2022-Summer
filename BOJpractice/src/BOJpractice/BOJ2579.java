package BOJpractice;

import java.util.Scanner;

public class BOJ2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int dp[]= new int[n+1];
		
		for(int i=1;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		dp[1] = arr[1];
		
		if(n>=2) {
		dp[2] = arr[1] + arr[2];
		}
		
		if(n>=3) {
			dp[3] = Math.min(arr[1]+arr[3],arr[2]+arr[3]);
			for(int i=4;i<n+1;i++) {
			dp[i] = Math.min(dp[i-2], arr[i-1]+dp[i-3])+arr[i];
		}
			}
		
		System.out.println(dp[n]);
		}	
		
		
		
	}

