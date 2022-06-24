package practice;
import java.util.*;

public class BOJ7568 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][3];
		int cnt;
		
		for(int i=0; i<N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
					}
		for(int i=0;i<arr.length;i++) {
			cnt = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i][0]<arr[j][0] &&arr[i][1]<arr[j][1]) 
				{
					cnt++;
				}
			}
			arr[i][2] = cnt+1;
			
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i][2]+" ");
		}
		
		
		
		
		
		
	}

}
