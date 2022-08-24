package BOJpractice;

import java.util.Scanner;
import java.util.Stack;


public class BOJ2812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = k;
		String s = sc.next();
		Stack<Integer> max = new Stack<>();

		
		for(int i=0; i<n; i++)
		{
			
			while(!max.isEmpty()&&max.peek()< s.charAt(i)-'0'&& cnt>0)
				{	
					max.pop();
					cnt--;
				}
			max.add(s.charAt(i)-'0');
		}
		
		for(int i=0;i<n-k; i++)
		{
			System.out.print(max.get(i));
		}
		
		
	}

}
