package BOJpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1373 {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		String s = sc.next();
		ArrayList<Character> al = new ArrayList<>();
		int cnt = 0;
		int sum = 0;
		
		for(int i=s.length()-1;i>=0;i--) {
			if(cnt == 3)
			{
				al.add((char)(sum+'0'));
				sum = 0;
				cnt = 0;
			}
			
			if(s.charAt(i)=='1')
			{
				sum += Math.pow(2, cnt);
			}			

			cnt++;
		}
		
		al.add((char)(sum+'0'));
		
		for(int i=al.size()-1; i>=0; i--) {
			System.out.print(al.get(i));
		}
		
		System.out.println();
	}

}
