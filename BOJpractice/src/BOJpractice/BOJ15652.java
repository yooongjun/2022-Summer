package BOJpractice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ15652 {
	static int M;
	static int N;
	static int[] arr;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		arr = new int[M];
		func(1,0);
		bw.flush();
		
	}
	static void func(int parent, int depth) throws IOException{
		if(depth==M)
		{
			for(int i:arr)
			{
				bw.write(i+" ");
			}
			bw.newLine();
			return;
		}
		
	
		for(int i=parent;i<=N;i++) {
			arr[depth] = i;
			func(i, depth+1);
			
		}
	}
	
	
	
}
