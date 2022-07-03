package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ1269 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," "); 
		int N= Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<Integer> A = new HashSet<>();
		HashSet<Integer> B = new HashSet<>();
		
		st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++)
			A.add(Integer.parseInt(st.nextToken()));
		
		st= new StringTokenizer(br.readLine()," ");
		for(int i=0; i<M; i++)
			B.add(Integer.parseInt(st.nextToken()));
		
		int cross =0;
		int cnt=0; 
		
			for(int j:B) {
				if(A.contains(j))
					cross++; 			// 교집합의 수 구하기
			}

		
		cnt = A.size()-cross + B.size()-cross;
		
		
			
			System.out.println(cnt);
			
			
		
	}

}
