package practice;
import java.util.*;

public class BOJ2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M,N;
		M= sc.nextInt();
		N = sc.nextInt();
		int count =0;  //	min값 저장 후 count++;
		int min, sum;
		sum=0;
		min = 0;
		for(int i=M;i<=N;i++) {
			
			if(i==1) {
				continue;
			}			
			for(int j=2;j<=i;j++) {
			if(i==2) {
				min = i;
				sum+=i;
				count++;
				break;
				
			}

			if(i/j < j) {
				sum +=i;
				if(count == 0) {
					min = i;
					count++;
				}
				break;				
			}
			if(i%j==0) {
				break;
			}
			}
	
		}
		
		if(min==0&&sum==0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(min);
		sc.close();
		
	}

}
