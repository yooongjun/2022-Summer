package BOJpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ1764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<String, Integer> map  = new HashMap<>();
		ArrayList<String> al  = new ArrayList<>();
		for(int i= 0; i<n+1; i++) {
			map.put(sc.nextLine(), 1);
		}
		for(int i=0; i<m; i++) {
			String s = sc.nextLine();
			if(map.get(s) != null){
				al.add(s);
			}
		}
		
		Collections.sort(al);
		System.out.println(al.size());
		for(String i:al) {
			System.out.println(i);
		}

		
}

}
