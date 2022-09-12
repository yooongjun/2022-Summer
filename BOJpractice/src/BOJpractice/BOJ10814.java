package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class member implements Comparable<member>{
	int age;
	int n; //가입한 순서
	String name;
	
	member(int age, String name, int n){
		this.age = age;
		this.name = name;
		this.n = n;
	}

@Override
public int compareTo(member o) {
	if(this.age > o.age) {
		return 1;
	}
	else if(this.age == o.age) {
		if(this.n > o.n)
			return 1;
	}
	return -1;
	}
}

public class BOJ10814 {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		member[] arr = new member[n];
		
		for(int i=0; i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String temp = st.nextToken();
			arr[i] = new member(age, temp, i);
		}
		
		Arrays.sort(arr);
		
		for(member i: arr) {
			System.out.println(i.age +" "+ i.name);
		}
		
		
	}

}
