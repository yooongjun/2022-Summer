package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11660 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[][] = new int[N+1][N+1];
		int col[][] = new int[N+1][N+1];
		int tmp[][] = new int[N+1][N+1];
		
		for(int i=1; i<arr.length;i++) {
				st = new StringTokenizer(br.readLine());
			for(int j=1; j<arr.length;j++) {
				 arr[i][j] = Integer.parseInt(st.nextToken());
				 col[j][i] = arr[i][j] + col[j][i-1];
				 tmp[i][j] = tmp[i][j-1] + col[j][i];
			}
		}
		

		
		for(int i=0; i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int sum=0;
			if(y1==y2 && x1==x2) {
				sum = tmp[x2][y2] - tmp[x2][y1-1] - tmp[x1-1][y2] + tmp[x1-1][y1-1];
			}else {
				sum = tmp[x2][y2] - tmp[x2][y1-1] - tmp[x1-1][y2] + tmp[x1-1][y1-1];
			}
			System.out.println(sum);
		}
		
		
		
		
		
	}

}
