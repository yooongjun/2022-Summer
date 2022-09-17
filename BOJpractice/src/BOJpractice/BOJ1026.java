package BOJpractice;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = 0;
		int[] A = new int[N];
		int[] B = new int[N];
		
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		for(int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(B);
		
		for(int i=0 ; i<N; i++) {
			S += A[i] * B[N-1-i];
		}
		
		System.out.println(S);
		
	}

}
