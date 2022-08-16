package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class virus{	// 바이러스 인덱스
	int x;		
	int y;
	virus(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class wall{	// 벽 인덱스
	int x;
	int y;
	wall(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class BOJ14502 {
	static int map[][];
	static int temp[][];
	static int n,m;
	static ArrayList<virus> al;
	static ArrayList<wall> wal;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		al = new ArrayList<>();
		wal = new ArrayList<>();
		int cnt = 0;
		
		
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j]==2)
				{
					virus v = new virus(i,j);
					al.add(v);
				}else if(map[i][j] ==1){
					wall w = new wall(i,j);
					wal.add(w);
					}
				}
			}
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==1||map[i][j]==2)
					continue;
				else {
					for(int k=i;k<n;k++) {
						for(int l=0;l<m;l++) {
							if(k==i && l<=j)
								continue;
							if(map[k][l]==1||map[k][l]==2)
								continue;
							else {
								for(int p=k;p<n;p++) {
									for(int q=0;q<m;q++){
										if(p==k && q<=l)
											continue;
										if(map[p][q]==1||map[p][q]==2)
											continue;
										else {
											arrayCopy();
											temp[i][j] = 1;
											temp[k][l] = 1;
											temp[p][q] =1;
											for(int idx=0; idx<al.size();idx++) {
												spread(al.get(idx).x,al.get(idx).y);
											}
											cnt = Math.max(cnt, count());
										}
									}
								}
							}
						}
					}
				}
			}
		}
			System.out.println(cnt);
		
	}

	public static void arrayCopy() {
		temp = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0; j<m; j++) {
				temp[i][j] = map[i][j];
			}
		}
		
	}
	
	public static void spread(int a, int b) {  // BFS
		Queue<virus> queue = new LinkedList<>();
		virus v = new virus(a,b);
		queue.add(v);
		
		while(!queue.isEmpty()) {
			virus head = queue.poll();
			int x = head.x;
			int y = head.y;
			temp[x][y] = 2;
			
			if(y-1 >=0 && temp[x][y-1] == 0)		// 왼쪽
					queue.add(new virus(x,y-1));
			if(y+1< m && temp[x][y+1] == 0) 		// 오른쪽
				queue.add(new virus(x,y+1));
			if(x-1 >= 0 && temp[x-1][y] == 0)	// 위
				queue.add(new virus(x-1,y));
			if(x+1< n && temp[x+1][y] == 0)		// 아래
				queue.add(new virus(x+1,y));
		}
	}
		
	public static int count() {
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0; j<m;j++) {
				if(temp[i][j] == 0)
					cnt++;
			}
		}
		return cnt;
	}
	
	
}
	
	
	
	
	
	

