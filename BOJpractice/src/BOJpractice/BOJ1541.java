package BOJpractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Queue<Character> queue = new LinkedList<>();
		int state = -1; 
		int min = 0;
		for(int i=0; i<s.length(); i++) {
			queue.add(s.charAt(i));
		}
		
		while(!queue.isEmpty()) {
			char c = queue.peek();
			if(c == '-') { 
				queue.poll();
				if(state < 0)
					state *= -1;
			}else if(c == '+' && state > 0) { // state > 0 괄호 열린 상태
				queue.poll();
				min -= func(queue);
			}else if(c == '+' && state < 0) {
				queue.poll();
				min += func(queue);
 			}else {
 					if(state > 0)
					min -= func(queue);  
 					else
 					min += func(queue);
 			}
		}
		System.out.println(min);
	}
	
	static int func(Queue<Character> q) { //문자열에서 숫자만 빼기
		int sum = 0;
		String s = "";
		while(!q.isEmpty()){
				if(q.peek() <= 45) { // '-' == 45, '0' == 48
					break;
					}
				s = s.concat(q.poll().toString());
		}
		sum = Integer.parseInt(s);
		return sum;
	}
	
	
}
