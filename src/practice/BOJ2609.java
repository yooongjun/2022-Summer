package practice;

import java.util.Scanner;

public class BOJ2609 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b= sc.nextInt();
			int gcd = gcd(a,b);
				
			System.out.println(gcd);
			System.out.println(a*b/gcd);
		
			
			
	}

	public static int gcd(int a,int b) {
		int temp=0;
		while(b>0) {
			temp = a%b;
			a= b;
			b= temp;
		}
		
		
		return a;
	}
	
	
}
