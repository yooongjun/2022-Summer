package BOJpractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2164 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		for(int i=0;i<N-1;i++) {
			queue.poll();
			int temp = queue.peek();
			queue.poll();
			queue.add(temp);
		}
		System.out.println(queue.peek());
	}

}
