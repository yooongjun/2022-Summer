package BOJpractice;

import java.util.Scanner;

public class BOJ11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= sc.nextInt();
		int coin[] = new int[n+1];
		for(int i=1;i<coin.length;i++) {
			coin[i] = sc.nextInt();
		}
		
		int cnt=0;
		while(k!=0) {
			for(int i=n;i>0;i--) {
				if(k<coin[i])
					continue;
				else {
					cnt += k/coin[i];
					k=k%coin[i];
				}
			}
		}
		System.out.println(cnt);
		
		
		
		
	}

}
