package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class BOJ2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N;
		String s = br.readLine();
		N = Integer.parseInt(s);
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		ArrayList<Integer> al = new ArrayList<>();

		for(int i=0;i<N;i++) {
			al.add(arr[i]);
		}
		
		Collections.sort(al);
			
		for(int i=0;i<al.size();i++)
			sb.append(al.get(i)).append("\n");
		System.out.println(sb);
		
		
		
		
	}

}
