package BOJpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ12101 {
	static StringBuilder sb = new StringBuilder();
	static ArrayList<String> al = new ArrayList<>();
	static int n;
	static int k;
	static int cnt = 0;
	static boolean f;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		int dp[] = new int[12];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		if(n>=4) {
			for(int i=4;i<=n;i++)
				dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		}
		func(0, "");
		if(f) {
			System.out.println(al.get(0));
		}else {
			System.out.println(-1);
		}
		
		sc.close();
	}
	
	public static void func(int sum, String s) {
		String tmp = String.valueOf(s);
		if(sum>n) {
			return ;
		}
		
		if(sum == n) {
			cnt++;
			if(cnt==k)
			{
				al.add(tmp);
				f = true;
			}
			return;
		}
		
		for(int i=1; i<=3; i++) {
			sb = new StringBuilder();
			
			if(tmp == "")
				sb.append(i);
			else 
			sb.append(tmp+"+"+i);
			
			func(sum+i,sb.toString());
		}
		
	}
	
	
	
	

}
