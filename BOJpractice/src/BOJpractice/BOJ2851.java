package BOJpractice;

import java.util.Scanner;

public class BOJ2851 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum[] = new int[11];
		for(int i=1; i<sum.length;i++) {
			sum[i] = sc.nextInt();
			sum[i] += sum[i-1];
			if(sum[i]==100) {
				System.out.println(sum[i]);
				break;
			}else if(sum[i] > 100 ) {
				if(Math.abs(sum[i-1]-100) < Math.abs(sum[i]-100))
					System.out.println(sum[i-1]);
				else
					System.out.println(sum[i]);
				break;
			}
			
			if(i == sum.length-1)
				System.out.println(sum[10]);
		}
		
		
	}

}
