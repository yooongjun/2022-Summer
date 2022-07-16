package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1912 {
	static int[] arr,dp;
	static int max;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr = new int[n];
			for(int i=0;i<arr.length;i++)
				arr[i] = Integer.parseInt(st.nextToken());
			dp = new int[n];
			func();
			System.out.println(max);
			
	}

	static void func() {
		dp[0] = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
		}
	
		Arrays.sort(dp);
		max = dp[dp.length-1];
		
	}
	
	
}
