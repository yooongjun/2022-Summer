package BOJpractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ18258 {
	static int arr[];// arr[0] == size
	static int n;
	static int last;
	static int first = 1;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()){
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					pop();
					break;
				case "size":
					size();
					break;
				case "empty": 
					empty();
					break;
				case "front":
					front();
					break;
				case "back":
					back();
					break;
			}
		}
		bw.flush();
	}

	public static void push(int i){
			arr[last+1] = i;
			arr[0]++;
			last++;
	}
	
	public static void pop() throws IOException{
		if(arr[0]==0) {
			bw.write(-1+"\n");
			return;
		}
		else {
			bw.write(arr[first]+"\n");
			arr[0]--;
			first++;
		}
	}
	
	public static void size() throws IOException {
		bw.write(arr[0]+"\n");
		return;
	}

	public static void empty() throws IOException {
		if(arr[0]==0){
			bw.write(1+"\n");
			return;}
			else {
			bw.write(0+"\n");
			return;
			}
	}
	public static void front() throws IOException {
		if(arr[0]==0) {
			bw.write(-1+"\n");
			return;
		}
		else
		{		bw.write(arr[first]+"\n");
				return;	
		}
		}
	
	public static void back() throws IOException {
		if(arr[0]==0) {
			bw.write(-1+"\n");
			return;
		}else {
			bw.write(arr[last]+"\n");
			return;
		}
	}
}




