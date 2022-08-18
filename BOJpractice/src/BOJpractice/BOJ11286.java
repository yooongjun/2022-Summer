package BOJpractice;

import java.util.PriorityQueue;
import java.util.Scanner;
class X implements Comparable<X>{
	int v;
	int abs;
	X(int v){
		this.v = v;
		this.abs = Math.abs(v);
	}
	
	@Override
	public int compareTo(X o) {
		if(this.abs > o.abs)
			return 1;
		else if(this.abs < o.abs)
			return -1;
		else {
			if(this.v < o.v) {
				return -1;
			}else {
				return 1;
			}
		}
	}

}

public class BOJ11286 {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PriorityQueue<X> queue = new PriorityQueue<>();
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				int tmp = sc.nextInt(); 
				if(tmp == 0) {
					if(queue.isEmpty())
						System.out.println(0);
					else {
						System.out.println(queue.poll().v);
					}
				}else {
					X x= new X(tmp);
					queue.add(x);
				}
			}
	}

}


