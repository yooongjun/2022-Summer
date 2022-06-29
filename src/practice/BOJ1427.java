package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1427 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Integer[] arr = new Integer[s.length()];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = s.charAt(i)-'0';
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		
		
		
	}

}
