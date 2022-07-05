package practice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ2981 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}		
		Arrays.sort(arr);
		
		long gcdval = arr[1]-arr[0];
		for(int i = 2; i < n; i++) {
			gcdval = gcd(gcdval, arr[i] - arr[i - 1]);
		}
 
		
		for(int i=2 ;i<=gcdval/2; i++) {
			
			if(gcdval % i ==0)
				sb.append(i+" ");
		}
		sb.append(gcdval);
		System.out.println(sb);
		
		
	}
	public static long gcd(long a,long b) {

		while(b!=0) {
			long r = a%b;
			a= b;
			b= r;
		}
	return a;	
	}
	

}
