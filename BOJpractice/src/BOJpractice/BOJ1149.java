package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1149 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N+1][3];  // 0,1,2 R,G,B
		int R[] = new int[N+1];
		int G[] = new int[N+1];
		int B[] = new int[N+1];
		

		for(int i=1; i<N+1;i++) {
			st= new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());			
			arr[i][2] = Integer.parseInt(st.nextToken());		
		}
		
		R[1] = arr[1][0];
		G[1] = arr[1][1];
		B[1] = arr[1][2];
		
		for(int i=2; i<arr.length;i++) {
			R[i] = arr[i][0] + Math.min(G[i-1], B[i-1]);
			G[i] = arr[i][1] + Math.min(R[i-1], B[i-1]);
			B[i] = arr[i][2] + Math.min(R[i-1], G[i-1]);
		}
		
		System.out.println(Math.min(Math.min(R[N], G[N]),B[N]));
		
	
	

	}
	
}
