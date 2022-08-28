package BOJpractice;

import java.util.Scanner;

public class BOJ1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		char arr[] = s.toCharArray();
		int count[] = new int[10];
		int cnt =1; // 최소 1개는 필요
		int min=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]-'0' == 9 || arr[i] - '0' == 6)
			{	
				if(count[6]>0&&count[6] %2 == 0 && 2*cnt<= count[6]) {
					count[6]++;
					cnt++;
				}
				else {
				count[6]++;
				}
			}else {
			if(cnt == 0 || cnt <= count[arr[i]-'0'])
				cnt++;
			count[arr[i]-'0']++;
			}
		}
		
		System.out.println(cnt);
		
		
		
			
		
	}

}
