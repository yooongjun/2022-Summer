package practice;
import java.util.*;

public class BOJ1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=0;
		N = sc.nextInt();
		int arr[] = new int[N];
		int count=N;
		
		for(int i=0; i<N;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		
		
		for(int i=0;i<N;i++) {
			
			if(arr[i]==1) {
				count--;
				continue;
			}
			for(int j=2;j<arr[i];j++) {
					if(arr[i]/j<j) {    // ���� ������ ������ �۾����� ���̻� �˻��� �ʿ� x 
					break;						
				}

				if(arr[i]%j==0) {   // �Ҽ��� �ƴ� ��� break;
					count--;
					break;
				}	
			}	
		}
		
		
		System.out.println(count);
		
		
		
		
		
	}

}
