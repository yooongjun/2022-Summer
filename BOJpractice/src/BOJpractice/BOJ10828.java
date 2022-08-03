package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class BOJ10828 {
	static ArrayList stack = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken());
		String s;
		for(int i=0;i<n;i++) {
			st= new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "top":
				top();
				break;
			}
		}
	}
	
	public static void push(int i) {
		stack.add(i);
	}
	public static void top() {
		if(stack.isEmpty()) {
			System.out.println(-1);
		}else {
		System.out.println(stack.get(stack.size()-1));
	}}
	public static void size() {
		System.out.println(stack.size());
	}
	public static void pop() {
		if(stack.isEmpty()) {
			System.out.println(-1);
		}
		else {
			System.out.println(stack.get(stack.size()-1));
			stack.remove(stack.size()-1);
		}
	}
	public static void empty() {
		if(stack.isEmpty())
			System.out.println(1);
		else
			System.out.println(0);
	}
	
}
