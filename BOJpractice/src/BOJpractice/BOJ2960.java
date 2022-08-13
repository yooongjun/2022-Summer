package BOJpractice;

import java.util.Scanner;

public class BOJ2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc .nextInt();
		int cnt=0;
		
		int arr[] = new int[n+1];
		for(int i=1; i<arr.length; i++) {
			arr[i] = i;
		}

		for(int i=2; i<n+1; i++) {
			if(arr[i] == 0)
				continue;
			else {
				for(int j=1; j*i<=n; j++) {
					if(arr[i*j]==0) {
						continue;
						}
					cnt++;
					if(cnt==k) {
						System.out.println(arr[i*j]);
					}
					arr[i*j] = 0;
				}
			}			
		}
		
	}

}
