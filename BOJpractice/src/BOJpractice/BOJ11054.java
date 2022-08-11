package BOJpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ11054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n+1];
		int dp[] = new int[n+1];
		int reverse_dp[] = new int[n+1];
		int tmp[] = new int[n+1];
		int max = -1;
		
		ArrayList<Integer> al = new ArrayList<>();   
		
		for(int i=1;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}	
		
		for(int i=1;i<n+1;i++) {
			if(al.size()==0||al.get(al.size()-1)<arr[i]) {
				al.add(arr[i]);
			}else {
				al.set(lowerBound(al,arr[i],0),arr[i]);
			}
			tmp[i] = al.get(al.size()-1);
			dp[i] = al.size();
		}

		for(int k=0;k<n+1;k++)
		{		
			al = new ArrayList<>();
			for(int i=k+1;i<n+1;i++) {
				
			if(al.size()==0 && tmp[k]==arr[i]) {
				continue;
			}
				
			if(al.size()==0||al.get(al.size()-1)>arr[i]) {
				al.add(arr[i]);
			}else {
				if(upperBound(al,arr[i],0)==0&&tmp[k]==arr[i]) {
					continue;
				}
				al.set(upperBound(al,arr[i],0),arr[i]);
			}
		}
			reverse_dp[k] = al.size();
		}
		
		for(int i =0; i<n+1;i++) {
			max = Math.max(max, dp[i]+reverse_dp[i]);
		}
		
		System.out.println(max);
		
	}
	
	static int lowerBound(ArrayList<Integer> list, int value,int begin) {
		int start = begin;
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
	
	static int upperBound(ArrayList<Integer> list, int value, int begin) { // 내림차순 정렬 가정
		int start = begin;
		int end = list.size();
		
		while(start < end) {
			int mid = (start+end)/2;
			
			if(list.get(mid)<=value) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return end;
	}

}
