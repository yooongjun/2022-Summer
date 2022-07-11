package BOJpractice;
import java.util.Scanner;


public class BOJ9663 {
	static int cnt=0;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
			boolean[][] arr = new boolean[N][N];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length; j++)
					arr[i][j] = true;
			}
			func(0,arr);
			System.out.println(cnt);
	}

	
	static void func(int depth,boolean [][]arr)
	{
		if(depth == N) {
			cnt++;
			return;
		}

		for(int j=0;j<N;j++) {
			boolean[][] temp = new boolean[N][N];
			for(int i=0; i<arr.length; i++)
				System.arraycopy(arr[i], 0, temp[i], 0, arr[0].length);
			
			if(arr[j][depth]==true)
			{
				for(int i=0;i<arr.length;i++)
				{
					temp[i][depth] = false;	  // 세로 공격범위 지우기
					temp[j][i]= false;  // 가로 공격범위 지우기
				}
				int k = j;
				for(int i=depth;i<arr.length;i++) { 
					if(k>=N)
						break;
					temp[k][i] = false;
					k++;
				}
				k = j;
				for(int i=depth;i<arr.length;i++) { 
					if(k<0)
						break;
					temp[k][i] = false;
					k--;
				}
				
			func(depth+1,temp);
		}
			}	
	}}
