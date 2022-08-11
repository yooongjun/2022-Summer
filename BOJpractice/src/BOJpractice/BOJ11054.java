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
		ArrayList<Integer> right = new ArrayList<>();   
		ArrayList<Integer> left;
		for(int i=1;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}	
		
		for(int i=1;i<n+1;i++) {
			if(right.size()==0||right.get(right.size()-1)<arr[i]) {
				right.add(arr[i]);
			}else {
				right.set(lowerBound(right,arr[i],0),arr[i]);
			}
			tmp[i] = right.get(right.size()-1);
			dp[i] = right.size();
		}

		int idx=0;
		
		for(int k=0;k<n+1;k++)
		{		
			 left = new ArrayList<>();
			for(int i=idx+1;i<n+1;i++) {
				
			if(left.size()==0 && tmp[idx]==arr[i]) {
				continue;
			}
				
			if(left.size()==0||left.get(left.size()-1)>arr[i]) {
				left.add(arr[i]);
			}else {
				if(upperBound(left,arr[i],0)==0&&tmp[idx]==arr[i]) {
					continue;
				}
				left.set(upperBound(left,arr[i],0),arr[i]);
			}
		}
			idx++;
			reverse_dp[k] = left.size();
		}
		
		
		
		int max =0;
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
