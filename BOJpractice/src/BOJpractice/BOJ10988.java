package BOJpractice;

import java.util.Scanner;

public class BOJ10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char arr[] = sc.nextLine().toCharArray();
		for(int i = 0; i<arr.length/2; i++) {
			if(arr[i]!= arr[arr.length-1-i])
			{
				System.out.println(0);
				return ;
			}
		}
		System.out.println(1);
		
		
	}

}
