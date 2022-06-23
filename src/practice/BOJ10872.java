package practice;
import java.util.*;

public class BOJ10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M= fact(N);
		
		System.out.println(M);
	}
	
	public static int fact(int n){
		int m;
		if(n<=1) 
			return 1;
		else{
			m= n*fact(n-1);
			return m;	
		}
	}
	
	
}
