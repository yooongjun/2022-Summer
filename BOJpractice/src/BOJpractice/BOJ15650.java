package BOJpractice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15650 {
	static int m;
	static int[] arr;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr= new int[m];
		func(1,0);
		
		
		
	}
	
	static void func(int parent,int depth) {
		
		if(depth == m) {
				for(int i:arr)
				System.out.print(i+" ");
				System.out.println();
				return;
		}
		
		for (int i = parent; i <= n; i++) {
			 
			arr[depth] = i;
			func(i + 1, depth + 1);
 
		}
	}

	
	
}
