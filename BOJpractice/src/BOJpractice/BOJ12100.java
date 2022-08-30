package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12100 {
	static int N;
	static boolean check[][];
	static int max = Integer.MIN_VALUE;
	static String[] command = {"up","down","right","left"};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int [][]board = new int[N][N];
		
		for(int i= 0; i <N; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			for(int j = 0 ; j<N; j++)
				board[i][j] = Integer.parseInt(st.nextToken());
		}
		
		BT(0,board);
		System.out.println(max);
		
	}
	
	
	
	static void copyArr(int arr[][], int temp[][]) {
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++) {
				temp[i][j] = arr[i][j];
			}
	}
	
	static void BT(int depth, int[][] board) { //BackTracking
		if(depth == 5) {
			for(int i=0; i<N; i++)
				for(int j=0; j<N; j++)
					max = Math.max(max, board[i][j]);
			return ;
		}
		for(int k=0; k<4; k++) {
			int temp[][] = new int[N][N];
			copyArr(board, temp);

			shift(temp, command[k]);
			BT(depth+1, temp);
		}
	}
	
	
	
	
	static void shift(int[][] board,String command){// command방향으로 블록 이동
		switch(command) {
			case "up":
				for(int i =0; i<N; i++) {
					check = new boolean[N][N];
					for(int j=0; j<N; j++) {
						int x = j;
						while(x>0) {
						if(board[x][i] == 0)
						{
							x--;
							continue;
						}
							
						if(board[x-1][i] == 0)
						{
							board[x-1][i] = board[x][i];
							board[x][i] = 0;
						}else if(board[x-1][i] == board[x][i] && !check[x-1][i])
						{
							board[x-1][i] += board[x][i];
							board[x][i] = 0;
							check[x-1][i] = true;
						}else {
							check[x-1][i] = true;
						}
						x--;
						}
					}
				}
				break;
			case "down":
				for(int i =0; i<N; i++) {
					check = new boolean[N][N];
					for(int j=N-1; j>=0; j--) {
						int x = j;
						while(x<N-1) {
						if(board[x][i] == 0)
						{
							x++;
							continue;
						}		
						if(board[x+1][i] == 0)
						{
							board[x+1][i] = board[x][i];
							board[x][i] = 0;
						}else if(board[x+1][i] == board[x][i] && !check[x+1][i])
						{
							board[x+1][i] += board[x][i];
							board[x][i] = 0;
							check[x+1][i] = true;
						}else{
							check[x+1][i] = true;
						}
						x++;
						}
					}
				}
				break;
			case "right":
				for(int i =0; i<N; i++) {
					check = new boolean[N][N];
					for(int j=N-1; j>=0; j--) {
						int y = j;
						while(y<N-1) {
						if(board[i][y] == 0)
						{
							y++;
							continue;
						}
						if(board[i][y+1] == 0)
						{
							board[i][y+1] = board[i][y];
							board[i][y] = 0;
						}else if(board[i][y+1] == board[i][y] && !check[i][y+1])
						{
							board[i][y+1] += board[i][y];
							board[i][y] = 0;
							check[i][y+1] = true;
						}else{
							check[i][y+1] = true;
						}
						y++;
						}
					}
				}
				break;
			case "left":
				for(int i =0; i<N; i++) {
					check = new boolean[N][N];
					for(int j=0; j<N; j++) {
						int y = j;
						while(y > 0) {
						if(board[i][y] == 0)
						{
							y--;
							continue;
						}
							
						if(board[i][y-1] == 0)
						{
							board[i][y-1] = board[i][y];
							board[i][y] = 0;
						}else if(board[i][y-1] == board[i][y] && !check[i][y-1])
						{
							board[i][y-1] += board[i][y];
							board[i][y] = 0;
							check[i][y-1] = true;
						}else{
							check[i][y-1] = true;
						}
						y--;
						}
					}
				}
				break;
		}
		return;
	}
}

