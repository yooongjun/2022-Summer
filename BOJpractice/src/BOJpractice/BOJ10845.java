package BOJpractice;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> q = new ArrayList<>();
		StringTokenizer st; 
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			st = new StringTokenizer(s);
			switch(st.nextToken()) {
			case "push":
				q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(q.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(q.get(0));
					q.remove(0);
				}
					break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "fornt":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.get(0));
				break;
			case "back":
				if(q.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(q.get(q.size()-1));
				}
				break;
				
			}
			
			
			
			
			
		}
		
		
		
		
	}

}
