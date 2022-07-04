package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n=1;
		int m=1;
        StringTokenizer st;
		while(true) {
        String s= br.readLine();
        st = new StringTokenizer(s);

        n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		if(n==0&&m==0)
			break;
		if(n>=m) {
			if(n%m==0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}else
		{
			if(m%n==0)
				System.out.println("factor");
			else
				System.out.println("neither");
		}
	}
	
}
}
