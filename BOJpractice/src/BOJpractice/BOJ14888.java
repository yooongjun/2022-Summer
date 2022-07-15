package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {
	static int n;
	static int arr[]; // ¼ö¿­
	static int ort[]; //operator 
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		ort = new int[4];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<ort.length;i++)
			ort[i] = Integer.parseInt(st.nextToken());
		
		func(arr[0],1);
		System.out.println(max+"\n"+min);
	}
	
	static void func(int num, int idx) {

			if(idx == n) {
				if(num>max) {
					max = num;
				}
				if(num<min) {
					min = num;
				}
				return;
			}
		
			int result=0;
			for(int i=0;i<ort.length;i++) {
				if(ort[i]> 0) {
					ort[i]--;
				switch(i){
					case 0:
						func(num+arr[idx], idx+1);
						break;
					case 1:
						func(num-arr[idx], idx+1);
						break;
					case 2:
						func(num*arr[idx], idx+1);
						break;
					case 3:
						func(num/arr[idx], idx+1);
							break;
					}
					ort[i]++;
				}
				
		}
		
		
	}
	
	
	
	

}
