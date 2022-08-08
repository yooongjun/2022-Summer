package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class item{
	int w;
	int v;
	item(int w,int v){
		this.w = w;
		this.v = v;
	}
}


public class BOJ12865 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int dp[][] = new int[N+1][K+1];
		item arr[] = new item[N+1];
		for(int i=1;i<arr.length;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new item(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}

		for(int i=1;i<N+1;i++) { // 아이템 품목 
			for(int j=1;j<K+1;j++) { // 무게
				if(arr[i].w>j) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i].w]+arr[i].v);
				}
			}
		}
		
		System.out.println(dp[N][K]);
		
		
	}
} 	