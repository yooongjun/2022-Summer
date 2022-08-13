package BOJpractice;

import java.util.Scanner;

public class BOJ2630 {
	static boolean paper[][];
	static int n;
	static int w, b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n =  sc.nextInt();
		paper = new boolean[n+2][n+2];
		w= 0; b= 0;
		for(int i= 1; i<n+1; i++) {
			for(int j= 1; j<n+1; j++) {
				if(sc.nextInt()==1)  	
					paper[i][j]=true;		// 파란색		
				else
					paper[i][j] = false;	// 흰색
			}
		}
		
		if(needDivide(n,1,1)==0) {
			System.out.println(w+"\n"+b);
			return ;
		}else {
			divide(n/2, 1, 1);
			divide(n/2, 1, 1+n/2);
			divide(n/2, 1+n/2, 1);
			divide(n/2, 1+n/2, 1+n/2);
		}
		System.out.println(w+"\n"+b);
	}
	public static void divide(int size, int x, int y){ //(x,y)부터 size로 4등분 하는  함수
		
		if(needDivide(size,x,y)==0)
			return;
		
		divide(size/2,x,y);
		divide(size/2,x,y+size/2);
		divide(size/2,x+size/2,y);
		divide(size/2,x+size/2,y+size/2);
	}
	
	public static int needDivide(int size, int x, int y) {   // (x,y)좌표부터 size만큼 조사
		boolean check = paper[x][y];
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size; j++) {
				if(paper[i][j]!=check) 
					return 1; 			// 첫번째 원소랑 다르면 divide가 필요함
			}
		}
		if(paper[x][y] == false) {
			w++;
			return 0;
		}else {
			b++;
			return 0;
		}
	}

}
