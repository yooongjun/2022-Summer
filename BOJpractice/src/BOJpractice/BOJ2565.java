package BOJpractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class BOJ2565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			map.put(sc.nextInt(), sc.nextInt());
		}
		
		for(Integer value: map.values()) {
			if(al.size()==0||al.get(al.size()-1)<value){
				al.add(value);
				continue;
			}else {
				al.set(lowerBound(al,value), value);
			}
		}
		System.out.println(n-al.size());
		
		
	}
	static int lowerBound(ArrayList<Integer> list, int value) {
		int start = 0;
		int end = list.size();
		while(start<end) {
			int mid = (start+end)/2;
			if(list.get(mid)>=value) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return end;
	}
	
}
