package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ14425 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N= Integer.parseInt(st.nextToken());
		ArrayList<String> al = new ArrayList<String>();
		int M= Integer.parseInt(st.nextToken());
		int count=0;

		for(int i=0;i<N;i++)
			al.add(br.readLine());
		for(int i=0; i< M; i++)
		{
			String s = br.readLine();
				for(String temp: al)
				if(s.equals(temp))
					count++;
			
		}
		
		System.out.println(count);

	}

}
