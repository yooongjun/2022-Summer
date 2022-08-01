package BOJpractice;

import java.util.Scanner;

public class BOJ13305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long dt[] = new long[N];
		long cost[] = new long[N+1];
		long total = 0;
		long tmp = 0; //ÇöÀç cost
		
		for(int i=1;i<dt.length;i++) {
			dt[i] = sc.nextInt();
		}
		
		for(int i=1;i<cost.length;i++) {
			cost[i] = sc.nextInt();
		}
		
		tmp = cost[1];
		
		for(int i=1;i<dt.length;i++) {
			if(tmp>cost[i+1]) { 
				total += tmp*dt[i];
				tmp = cost[i+1];
				}else {
					total += tmp*dt[i];
				}
		}
		System.out.println(total);
		
	}

}
