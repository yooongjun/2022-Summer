package BOJpractice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1715 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			
			int n = sc.nextInt();
			long cnt = 0;
			
			for(int i=0; i<n ;i++) {
				queue.add(sc.nextInt());
			}
			
				while(queue.size()>1) {
					int tmp = queue.poll();
					tmp += queue.poll();
					cnt += tmp;
					queue.add(tmp);
				}
			System.out.println(cnt);
	}
}
