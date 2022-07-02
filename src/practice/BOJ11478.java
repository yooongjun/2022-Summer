package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ11478 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ArrayList<String> al= new ArrayList<>();
		int end=0;
		int start=0;
		int interval = 1; //간격
		int count =0;
		
		while(true) {
			if(interval>s.length())
				break;
			start=0;
			end = start+interval;
			for(int i=0;i<s.length();i++) {
			if(end>s.length())
				break;
			al.add(s.substring(start, end));
			start++;
			end++;
			}
			interval++;
		}
		al.sort(null);
		count = al.size(); // 부분 문자열의 수
		for(int i=0;i<al.size();i++) {
			if(i<=al.size()-2&&al.get(i).equals(al.get(i+1))){
						count--;}
		}
		System.out.println(count);
		
	
	}

}
