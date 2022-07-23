package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2559 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int arr[] =new int[n+1];
		int sum[] = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i] = sum[i-1] + arr[i];
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=k;i<n+1;i++) {
			max = Math.max(max, sum[i]-sum[i-k]);
		}
		
		System.out.println(max);
		
		
		
		
		
		}

}
