package BOJpractice;

import java.util.Scanner;

public class BOJ2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a[] = sc.next().toCharArray();
		char b[] = sc.next().toCharArray();
		int n1,n2;
		n1 = n2 = 0;
		for(int i=0; i<3; i++) {
			n1 += (a[i]-'0')*Math.pow(10,i);
			n2 += (b[i]-'0')*Math.pow(10,i);
		}
		
		
		System.out.println(Math.max(n1, n2));
	}

}
