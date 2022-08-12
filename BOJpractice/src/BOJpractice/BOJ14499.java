package BOJpractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ14499 {
	static int map[][];
	static int dice[];  // 1(상),2(좌),3(윗면),4(우),5(하),6(아랫면)
	static int x,y,n,m; // 주사위의 좌표
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		dice = new int[7];
		
		for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<k;i++) {
			int tmp = 0;
		switch(Integer.parseInt(st.nextToken())) {
			case 1:
				tmp= right();
				break;
			case 2:
				tmp = left();
				break;
			case 3:
				tmp = up();
				break;
			case 4:
				tmp = down();
				break;
		}
		if(tmp!=-1)
		bw.write(tmp+"\n");
	}
		bw.flush();
	
	}
	public static int isOut(int order){ 	// map 밖으로 나가는 명령인지 확인하는 함수
		int k= 1;
		switch(order) {
		case 1:
			if(y==m-1)
				k=0;
			break;
		case 2:
			if(y==0)
				k=0;
			break;
		case 3:
			if(x==0)
				k=0;
			break;
		case 4:
			if(x==n-1)
				k=0;
			break;
		}
		return k;
	}
	
	public static void floor() {
		if(map[x][y] == 0) {
			map[x][y] = dice[6];
			return;
		}else {
			dice[6] = map[x][y];
			map[x][y] = 0;
			return;
		}
		
	}
	
	public static int right() {
		if(isOut(1)==0) {
			return -1;
		}
		int arr[] = dice.clone();
		dice[2] = arr[6];
		dice[3] = arr[2]; 
		dice[4] = arr[3];
		dice[6] = arr[4];
		y++;
		floor();
		return dice[3];
	}
	
	public static int left() {
		if(isOut(2)==0) {
			return -1;
		}
		int arr[] = dice.clone();
		dice[2] = arr[3];
		dice[3] = arr[4]; 
		dice[4] = arr[6];
		dice[6] = arr[2];
		y--;
		floor();
		return dice[3];
	}
	
	public static int up() {
		if(isOut(3)==0) {
			return -1;
		}
		int arr[] = dice.clone();
		dice[1] = arr[3];
		dice[3] = arr[5]; 
		dice[5] = arr[6];
		dice[6] = arr[1];
		x--;
		floor();
		return dice[3];
	}
	
	public static int down() {
		if(isOut(4)==0) {
			return -1;
		}
		int arr[] = dice.clone();
		dice[1] = arr[6];
		dice[3] = arr[1]; 
		dice[5] = arr[3];
		dice[6] = arr[5];
		x++;
		floor();
		return dice[3];
	}
	
	
	
	
	

	
}
