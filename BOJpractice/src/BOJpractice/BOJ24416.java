package BOJpractice;

import java.util.Scanner;

public class BOJ24416 {
	static int[] f;
	static int cnt=0;
	static int count=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f= new int[n+1];
		fib(n);
		fibonacci(n);
		System.out.println(count+" "+cnt);
		
	}
	
	public static int fib(int n) {
		
	    if (n == 1 || n == 2)
	    {	
	    	count++;
	    	return 1;  
	    }
	    else return (fib(n - 1) + fib(n - 2));
	}
	
	public static int fibonacci(int n) {
	    f[1] = f[2] = 1;
	    for (int i=3;i<=n;i++) {
	        f[i] = f[i - 1] + f[i - 2];
	        cnt++;
	    	}  
	    return f[n];
	}
	
	
	
}
