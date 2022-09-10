package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PG기출1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String ans = solution(s);
		
		System.out.println(ans);
		
	}
	
    public static String solution(String tmp) throws IOException{
		StringBuilder sb;
		StringTokenizer st = new StringTokenizer(tmp);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			min = Math.min(min, n);
			max = Math.max(max, n);
		}
		
		sb = new StringBuilder(min+" "+max);
        return sb.toString();
    }
	
}
