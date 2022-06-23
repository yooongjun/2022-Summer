package practice;

import java.util.Scanner;

public class BOJ10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fib(n));
		
		
		
	}
	public static int fib(int N) {
		if(N==0) 
			return 0;
		
		if(N==1)
			return 1;
		return fib(N-1)+ fib(N-2);
	}
	

}
