package BOJpractice;

import java.util.Scanner;

public class BOJ10773 {
	static int arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr= new int[n+1];
		int k = 0;
		int sum = 0;
		for(int i=1; i<arr.length;i++) {
			k= sc.nextInt();
			if(k==0) {
				pop();
				continue;
			}else {
				push(k);
			}
		}
		
		for(int i:arr) {
			sum +=i;
		}
		System.out.println(sum);
		
	}
	
	public static void pop(){
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i-1]=0;
				break;
			}
		}
	}
	public static void push(int k) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == 0) {
				arr[i]= k;
				break;
			}
		}
	}
	
	

}
