package BOJpractice;

import java.util.Scanner;

public class BOJ11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		sc.nextLine();
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			temp += s.charAt(i)-'0';
		}
		
	System.out.println(temp);
	}

}
