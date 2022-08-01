package BOJpractice;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int sum=0;
		for(int i=1;i<n+1;i++) {
			arr[i] = sc.nextInt();
		}
	
		Arrays.sort(arr);
		
		for(int i=1;i<n+1;i++) {
			arr[i] = arr[i-1]+ arr[i];
			sum += arr[i];
		}
		
		System.out.println(sum);
		sc.close();
		
	}

}
