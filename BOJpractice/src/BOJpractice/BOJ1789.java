package BOJpractice;

import java.util.Scanner;

public class BOJ1789 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long s = sc.nextLong();
		int n = 1;
		int cnt = 0;
		while(true) {
			if(s-n>=0) {
				s= s-n;
				n++;
				cnt++;
			}else
				break;
		}

		System.out.println(cnt);
	}

}
