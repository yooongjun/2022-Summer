package BOJpractice;

import java.util.Arrays;
import java.util.Scanner;

class node implements Comparable<node>{
	int x;
	int y;
	node(int x,int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(node o) {
		if(this.x > o.x)
			return 1;
		else if(this.x == o.x) {
			if(this.y > o.y)
				return 1;
		}
		return -1;
	}
}


public class BOJ11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		node[] arr = new node[n];
		for(int i=0; i<n; i++){
			arr[i] = new node(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(arr);
		for(node x: arr) {
			System.out.println(x.x +" "+ x.y);
		}
		
		
		
		
	}

}
