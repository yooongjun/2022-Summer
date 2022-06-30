package practice;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ10815 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M;
		int arr[] = new int[N];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		M = sc.nextInt();
		int temp[] = new int[M];
		
		for(int i=0;i<M;i++)
			temp[i] = sc.nextInt();
		
		for(int i=0; i<M; i++)
			sb.append(binarySearch(arr,N,temp[i])+" ");
		System.out.println(sb);
	}
	
public static int binarySearch(int arr[], int n, int search) {
	int first =0;
	int last = n-1;
	int mid =0;
	
	while(first<=last) {
		
		mid = (first+last)/2;
		if(arr[mid] == search) {
			return 1;
		}
		if(arr[mid] <search) {
			first = mid+1;
		}else {
			last = mid -1;
		}
		
	}
	
	return 0;
	
	
 }
}