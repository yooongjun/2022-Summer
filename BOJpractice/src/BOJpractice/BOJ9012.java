package BOJpractice;

import java.util.Scanner;

public class BOJ9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++) {
			if(isVPS(sc.nextLine()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	static boolean isVPS(String s){
		int state = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				state++;
			}else if(s.charAt(i)==')'){
						state--;
				}
			
			if(state < 0) {   // ')'로 시작하거나, ())인 경우
				return false;
				}
			}
		 if(state == 0)
			 return true;
		 else
			 return false;  // state != 0 인 경우는 VPS가 아님
	}
	
	
	
}
