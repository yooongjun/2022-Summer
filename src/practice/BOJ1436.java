package practice;
import java.util.Scanner;

public class BOJ1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
	

		if(n>1) {
			func(n);
			
		}else {
			System.out.println(666);
		}
		sc.close();
	}
	
	public static void func(int n) {
		int count = 1;
		int prev= 0;
		int num = 0;
		
		while (true) {
			if(((prev%10000)/10)==666&&prev%10 !=6) {
				for(int i=0;i<1000;i++) {
					if(count == n) {
						System.out.println(prev*1000+num);
						return;
					}
					
					num++;
					count++;
									
				}
				prev++;
								
			}else if(prev%1000==666) {
				
				num=0;
				for(int i=0;i<1000;i++) 
				{
					if (count == n) {
						System.out.print(prev * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev++;
			}else if (prev % 100 == 66) {
				num = 600;
				for (int i = 0; i < 100; i++) {
					if (count == n) {
						System.out.print(prev * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev++;
 
			}else if (prev % 10 == 6) {
				num = 660;
				for (int i = 0; i < 10; i++) {
					if (count == n) {
						System.out.print(prev * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev++;
			}else {
				num = 666;
				if (count == n) {
					System.out.print(prev * 1000 + num);
					return;
				}
				count++;
				prev++;
 
			}
			
			
		}
		
	}
	
	
	
}
