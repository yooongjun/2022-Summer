package practice;
import java.util.*;

public class BOJ1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=0;i<T;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println((a*b)/gcd(a,b));
		}
		
		
	}
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}

}
