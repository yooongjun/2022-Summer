package BOJpractice;

import java.util.Scanner;

public class BOJ4796 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int L, P, V;
		int i=1;
		while(true) {
			int cnt = 0;
			L = sc.nextInt();
			P = sc.nextInt(); 
			V = sc.nextInt();
			sc.nextLine();
			if(L==P && P==V && V==0)
				return;
			else {
				cnt += L;
				V -= P;
				while(V>=0) {
					if(V-P>=0) {
						cnt+=L;
						V-= P;
					}else if(V<L) {
						cnt += V;
						break;
					}else {
						cnt+=L;
						break;
					}
				}
				System.out.println("Case "+i+": "+cnt);
				i++;
			}
		}
	}

}
