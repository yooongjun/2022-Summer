package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ4153 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;
		int arr[] = new int[3];
		while(true) {
			s = br.readLine();
			if(s.equals("0 0 0"))
				return;
			st = new StringTokenizer(s);
			
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			
			Arrays.sort(arr);

			if(Math.pow(arr[2],2)== Math.pow(arr[0], 2)+ Math.pow(arr[1], 2))
				System.out.println("right");
			else
				System.out.println("wrong");
			
		}		
	}

}
