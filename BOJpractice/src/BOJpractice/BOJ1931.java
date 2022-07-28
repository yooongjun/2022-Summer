package BOJpractice;

import java.util.Arrays;
import java.util.Scanner;


public class BOJ1931 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		time[] arr = new time[n];
		int start , end;
		
		for(int i=0;i<n;i++) {
			arr[i] = new time();
			arr[i].start = sc.nextInt();
			arr[i].end = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int cnt =1;
		start = arr[0].start;
		end = arr[0].end;
		for(int i=1;i<arr.length;i++) {
			if(start == end && end == arr[i].end) {
				if(arr[i].start <end) {
					start = arr[i].start;
					end = arr[i].end;
					cnt++;
					continue;
				}else if(arr[i].start == start) {
					cnt++;
					continue;
				}
			}
			if(arr[i].start<end) {
				continue;
			}else{
				start =arr[i].start;
				end = arr[i].end;
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}


class time implements Comparable<time>{
	int start;
	int end;

	@Override
	public int compareTo(time o) {
		if(this.end> o.end) {
			return 1;
		}
		else if(this.end == o.end) {
			return 0;
		}else {
			return -1;
		}
	
	} 

}
