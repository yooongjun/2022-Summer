package BOJpractice;

import java.util.Scanner;

public class BOJ1904 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int dp[] = new int[N+1];
		// ��ȭ�� ���ϱ� dp[n] = dp[n-1] + dp[n-2]; --> ���� Ÿ�� ������ 1�� ���� �� + �� ���� Ÿ�Ͽ� 00�� ���� ��.
		dp[1] = 1;
		if(N>=2) {
		dp[2] = 2;
		for(int i=3;i<dp.length;i++){
			dp[i] = (dp[i-1]+dp[i-2])%15746;
		}
		
		}
	System.out.println(dp[N]);
		
		
		sc.close();
	}
		
}
