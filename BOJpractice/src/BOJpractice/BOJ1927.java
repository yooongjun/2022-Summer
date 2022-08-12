package BOJpractice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int tmp = sc.nextInt();
			if(tmp==0) {
				if(queue.size()==0)
					System.out.println(0);
				else 
					System.out.println(queue.poll());
			}else{
				queue.add(tmp);
			}		
		}
	}

}
