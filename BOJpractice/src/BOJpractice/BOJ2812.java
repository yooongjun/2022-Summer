package BOJpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ2812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int	cur = 0;
		String s = sc.next();
		int arr[] = new int[n+1];
		ArrayList<Integer> max = new ArrayList<>();
		
		for(int i=1; i<arr.length; i++)
			arr[i] = s.charAt(i-1)-48;
		
		while(max.size()!=n-k) {
			int tmp=arr[cur+1];
			for(int i=cur+1; i< n+1 ; i++) {
				if(tmp < arr[i])
				{
					tmp = arr[i];
					cur = i;
				}
				if(i > n - (k-max.size()) +1)
					break;
			}
			max.add(tmp);
		}
			
		System.out.println(max);
	
	}

}
