package practice;
import  java.util.*;

public class BOJ1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A,B,C;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		if(C<=B)
			System.out.println(-1);
		else
			System.out.println(A/(C-B)+1);
		
		
		sc.close();
		
	}

}
