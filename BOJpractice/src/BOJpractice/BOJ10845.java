package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10845 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> q = new ArrayList<>();
		StringTokenizer st; 
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push":
				q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(q.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(q.get(0));
					q.remove(0);
				}
					break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.get(0));
				break;
			case "back":
				if(q.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(q.get(q.size()-1));
				}
				break;
				
			}
			
			
			
			
			
		}
		
		
		
		
	}

}
