package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class BOJ2981_fail메모리초과 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		long[] arr= new long[n];
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr); // arr[1] 을 넘어서는 수는 조사할 필요 x

		
		int temp=0;
		ArrayList<Integer>[] list = new ArrayList[(int) (arr[0]+1)];
		ArrayList<Integer>[] end;
		ArrayList<Integer> sortedArray = new ArrayList<>();

		for(int i=0;i<list.length;i++)
			list[i] = new ArrayList<Integer>();
		
		for(int i=2;i<=arr[1];i++) {
			if(arr[1]%i == (temp =(int) (arr[0]%i)))
			{
				list[temp].add(i);
			}
			}

	if(n<=2) {
		for(int i=0;i<list.length;i++)
			for(int j=0; j<list[i].size();j++) {
				sortedArray.add(list[i].get(j));
			}
			Collections.sort(sortedArray);
			for(int i:sortedArray)
			System.out.print(i+" ");
	}
	else {
			end = func(arr,list);
			for(int i=0;i<end.length;i++)
				for(int j=0; j<end[i].size();j++) {
					sortedArray.add(list[i].get(j));
			}
			Collections.sort(sortedArray);
			for(int i:sortedArray)
			System.out.print(i+" ");
		}
	
	}
	
	
	public static ArrayList<Integer>[] func(long[] arr, ArrayList<Integer>[] list){


		for(int i=2;i<arr.length;i++) {
			for(int j=0;j<list.length;j++) {
				for(int k=list[j].size()-1;k>=0; k--) {
					
					if((arr[i]%list[j].get(k)) != j) {
						list[j].remove(k);
						}
				}
		}
	}
	return list;
	}
}
