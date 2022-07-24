package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1932 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] arr= new int[n+1][n+1];
		int [][] dp = new int[n+1][n+1];
		
		for(int i=0;i<n+1;i++) {
			Arrays.fill(arr[i], -1);
		}
		
		StringTokenizer st;	
		int k= 1;
		for(int i=1; i<n+1;i++) {
			st= new StringTokenizer(br.readLine());
			for(int j=1; j<=k;j++)
			arr[i][j]=Integer.parseInt(st.nextToken());
			k++;
		}
		
		dp[1][1] = arr[1][1];
		if(n>1) {
		for(int i=2; i<n+1;i++) {
			for(int j=1; j<n+1;j++) {
				if(arr[i][j] == -1)
					break;
				dp[i][j] = Math.max(dp[i-1][j-1]+arr[i][j], dp[i-1][j]+ arr[i][j]);
			}
			
		}
		Arrays.sort(dp[n]);}
		System.out.println(dp[n][n]);
	
	
	}

}
