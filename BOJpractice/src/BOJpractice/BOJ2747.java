package BOJpractice;

import java.util.Scanner;

public class BOJ2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();

		int fib[] = new int[n+1];
		
		fib[0] = 0;
		fib[1] = 1;
		if(n>=2) {
		fib[2] = 1;
		for(int i=3; i<fib.length;i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		}
		System.out.println(fib[n]);
		
	}

}
