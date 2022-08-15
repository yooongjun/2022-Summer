package BOJpractice;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1339 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		int[] cnum = new int[27];		// �迭�� �ε����� A~Z�� �ǹ���.
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextLine();
			char[] temp = arr[i].toCharArray();
			for(int j=0;j<temp.length;j++) {
				cnum[temp[j] - 64] += Math.pow(10, temp.length-1-j); // �ڸ��� �� ����ġ�� ��
			}
		}
		
		Arrays.sort(cnum);
		
		for(int i=1; i<=10; i++) {
			sum += cnum[cnum.length-i]*(10-i);
		}
		
		System.out.println(sum);
	}

}
