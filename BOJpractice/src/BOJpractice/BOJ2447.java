package BOJpractice;

import java.util.Scanner;

public class BOJ2447 {
	static char[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new char[N][N];
		StringBuilder sb = new StringBuilder();
		star(0,0,N,false);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	static void star(int x, int y,int N, boolean blank) {
		if(blank == true) {
			for(int i=x;i<x+N; i++) {
				for(int j=y;j<y+N; j++)
					arr[i][j] = ' ';
			}
			return;
		}
		else if(N==1){
				arr[x][y] = '*';
				return;
			}
		
			
		int size = N/3;
		int count = 0;
		for( int i = x; i<x+N; i+=size ) {
			for(int j=y;j<y+N;j+=size) {
				count++;
				if(count == 5) {
					star(i,j,size,true);
				}else {
					star(i,j,size,false);
				}
			}
			
		}
	}
}


