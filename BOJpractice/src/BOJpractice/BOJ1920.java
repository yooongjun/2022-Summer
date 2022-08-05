package BOJpractice;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			int start= 0;
			boolean key = false;
			int end = n-1;
			int k= sc.nextInt();
			int mid;
			while(start<=end) {
				mid = (start+end)/2;
				if(k == arr[mid])
				{
					key = true;
					System.out.println(1);
					break;
				}
				if(k>arr[mid]) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
			if(!key)
				System.out.println(0);
		}
	}
	
	
}
