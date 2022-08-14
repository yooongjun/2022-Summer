package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3273 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		int start,end; // 투 포인터
		int sum = 0;
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int x = Integer.parseInt(br.readLine());
		if(n==1) {
			if(arr[1]==x)
			cnt++;
		}else {
		start = 1; end = 2;
		while(start <= n-1) {
			sum = arr[start] + arr[end];
			if(sum == x ) {
				start++;
				cnt++;
				continue;
			}
			else if(sum < x) {
			for(int i = end; i<=n;i++) {
				sum = arr[start] + arr[i];
				if(sum>x) 
					break;
				if(sum == x){
					cnt++;
					break;}
				}
			}else {
				break;
			}
				start++;
				end = start+1;
			}
		}
		System.out.println(cnt);
	}

}
