package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s = new String[N];
		String temp;
		
		for(int i=0; i<N; i++) {
			s[i] = br.readLine();
		}

		Arrays.sort(s);  // 사전 순으로 정렬
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N-1;j++) {
				if(s[j].length()>s[j+1].length())
				{
					temp = s[j];
					s[j] = s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<N;i++) 
		{
			if(i<N-1&&s[i].equals(s[i+1])) {
				continue;
			}
			System.out.println(s[i]);
		}
	}
}
