package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<>();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i:arr) {
			if(al.size()==0||i>al.get(al.size()-1)) {
				al.add(i);
				continue;
			}else {
				al.set(lowerBound(al,i), i);
			}
		}
			System.out.println(al.size());
	}

	private static int lowerBound(ArrayList<Integer> al, int i) {
		int begin = 0;
		int end = al.size();
		
		while(begin< end) {
			int mid = (begin + end)/2;
			
			if(al.get(mid) >= i) {
				end = mid;
			}else {
				begin = mid+1;
			}
			
		}
		return end;
	}

}
