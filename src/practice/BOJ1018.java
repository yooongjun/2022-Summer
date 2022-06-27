package practice;
import java.util.*;

public class BOJ1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		int end=0;
		int count =0;
		int min=0;
		N=sc.nextInt();
		M=sc.nextInt();
		sc.nextLine();
		char map[][] = new char[N][M];
		String temp;
		char chess[][] = new char[8][8];
		
		
		// 입력 부분
		for(int i=0;i<N;i++) {
			temp = sc.nextLine();
			for(int j=0;j<M;j++) {
				map[i][j] = temp.charAt(j);
			}
		}

		
L1:		for(int i=0; i<N;i++) {
	L2:		for(int j=0;j<M;j++) {
				
				for(int h=0;h<8;h++){
					if(i+7>=N)
						break L1;
					for(int k=0;k<8;k++) {
					if(j+7>=M)
						break L2;
					chess[h][k]=map[i+h][j+k]; 
					}
				}
				count = func(chess);
				if((i==0&&j==0) || min>count)
					min= count;
			}
		}
		System.out.println(min);
	}

	public static int func(char temp[][]) {  // 8x8 배열 입력받아 색칠 수를 검사하는 함수.
  		int cnt = 0;
		int bcnt=0;
		char arr[][] = temp;
		char start = arr[0][0];
		
		// W로 시작
  		for(int i=0;i<8;i++) {
  			for(int j=0;j<8;j++) {
  				if(arr[0][0]!='W')
  				{
  					arr[0][0]='W';
  					cnt++;
  				}
     			if(arr[0][0] == 'W'){	 
  					if(i%2==0) //0,2,4,6번 행
  					{
  						if(j%2==0 && arr[i][j]!='W') { // 0,2,4,6번 열
  							cnt++;
  									}
  						else if(j%2!=0 && arr[i][j]!='B'){ // 1,3,5,7번 열
  							cnt++;
  						}
  					
  					}
  									
  					else {
  						if(j%2==0 && arr[i][j]!='B') {
  							cnt++;
  									}
  						else if(j%2!=0 && arr[i][j]!='W'){
  							cnt++;
  						}
  				 	}
  					}}}
  		//B로 시작
  		arr[0][0] = start;
  		
  		for(int i=0;i<8;i++) {
  			for(int j=0;j<8;j++) {
  					if(arr[0][0]!='B')
  					{
  						arr[0][0]='B';
  						bcnt++;
  					}
  						if(arr[0][0]=='B') { // B로 시작
  	  					if(i%2==0) //0,2,4,6번 행
  	  					{
  	  						if(j%2==0 && arr[i][j]!='B') {
  	  							bcnt++;
  	  									}
  	  						else if(j%2 != 0 && arr[i][j]!='W'){
  	  							bcnt++;
  	  						}
  	  					
  	  					}else {
  	  						if(j%2==0 && arr[i][j]!='W') {
  	  							bcnt++;
  	  									}
  	  						else if(j%2!=0 && arr[i][j]!='B'){
  	  							bcnt++;
  	  						}
  	  					}
  						}}}
  		if(bcnt>cnt)		
  			return cnt;
  		else
  			return bcnt;
	}
	
	
	
	
	
}
