package BOJpractice;

import java.util.Scanner;

public class BOJ13458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long A[] = new long[(int) (n+1L)];
		for(int i=1;i<A.length;i++)
		{
			A[i] = sc.nextInt();
		}
		long B = sc.nextInt();
		long C = sc.nextInt();
		
		long cnt=0;
		for(int i=1; i<A.length; i++) {
			A[i]= A[i]-B;
			cnt++;
			if(A[i]>0) {
				if(A[i]-C>0) {
					if(A[i]%C==0) {
						cnt+=A[i]/C;
					}else {
					cnt += A[i]/C+1;
					}
				}
				else {
					cnt += 1;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
