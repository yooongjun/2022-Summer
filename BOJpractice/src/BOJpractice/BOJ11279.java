package BOJpractice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ11279 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int temp;
			if((temp=sc.nextInt())==0) {
				if(maxHeap.size()==0) {
					System.out.println(0);
				}else {
					System.out.println(maxHeap.poll());
				}
			}else {
				maxHeap.add(temp);
			}
		}
		sc.close();
	}

}
