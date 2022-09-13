package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class person implements Comparable<person>{
	String name;
	int day;
	int month;
	int year;
	person(String name, int day, int month, int year){
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public int compareTo(person o) {
		if(this.year > o.year)
			return 1;
		else if(this.year == o.year) {
			if(this.month > o.month)
				return 1;
			else if(this.month == o.month)
			{
				if(this.day > o.day)
					return 1;
			}
		}
		return -1;
	}
	
}

public class BOJ5635 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		person[] arr = new person[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			arr[i] = new person(name,day,month,year);
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1].name);
		System.out.println(arr[0].name);
	}

}
