package BOJpractice;

import java.util.Scanner;

public class BOJ1003 {
	static int num1[];
	static int num0[];
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int n= sc.nextInt();
			fibcnt(n);
		}
		
	}

	public static void fibcnt(int n) {
		if(n>=2) {
			num1 = new int[n+1];
			num0 = new int[n+1];
			num0[0] = 1;
			num0[1] = 0;
			num1[0] = 0;
			num1[1] = 1;
			
			for(int i=2; i<n+1; i++) {
				num0[i] = num0[i-1] + num0[i-2];
				num1[i] = num1[i-1] + num1[i-2];
			}
		}else {
			num1 = new int[2];
			num0 = new int[2];
			num0[0] = 1;
			num0[1] = 0;
			num1[0] = 0;
			num1[1] = 1;
		}
		System.out.println(num0[n] +" "+ num1[n]);

	}
		
		
	
	
	
}
