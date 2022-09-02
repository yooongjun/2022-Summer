package BOJpractice;

import java.util.Scanner;

public class BOJ1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int f = sc.nextInt();
		int tmp = n%100;
		if(n%f != 0){
			if(tmp-n%f>=0) {
				tmp -= n%f;
			}else{
				tmp += f-n%f;
			}
		}
		
		while(tmp-f>=0) {
			tmp -= f;
		}
		if(tmp< 10) {
			System.out.println("0" + tmp);
		}else
			System.out.println(tmp);
	}

}
