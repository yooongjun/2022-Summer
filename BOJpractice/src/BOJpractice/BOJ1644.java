package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1644 {
	static ArrayList<Integer> sum;
	static ArrayList<Integer> al;
	static boolean arr[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		sum = new ArrayList<>();
		al = new ArrayList<>();
		sum.add(0); al.add(0);
		
		if(N<2) {
			System.out.println(0);
			return;
		}else {
			
		prime(N);
		
		for(int i=0;i<al.size()-1;i++) {
			for(int j=i+1; j<al.size(); j++) {
				int num = sum.get(j)-sum.get(i);
				if(num < N)
					continue;
				else if(num>N)
					break;
				else{
					cnt++;
					break;}
				}
			}
		
		System.out.println(cnt);
		}
	}
	public static void prime(int N) {
		arr = new boolean[N+1];
		
		arr[0] = arr[1] = true;
		for(int i=2; i*i<=N; i++) {
			if(!arr[i]) {
			for(int j= i+i; j<=N; j+=i)
				arr[j]=true;
			}
		}
		for(int i=1; i<=N; i++) {
			if(!arr[i]) {
				al.add(i);
				sum.add(sum.get(sum.size()-1)+i);
			}
		}
	}
}
