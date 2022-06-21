package practice;
import java.util.*;


public class BOJ1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		char c;
		char next;
		int gnum;
		boolean b = true;
		gnum = 0;
		N= sc.nextInt();
		sc.nextLine();
		String s[];
		s = new String[N];
		gnum = N;
		for(int i=0; i<N; i++)
			s[i] = sc.nextLine();
		for(int i = 0; i<N; i++) {
			mid:for(int j=0; j<s[i].length(); j++)
			{
				c = s[i].charAt(j);
				b= true;
				for(int k=j+1;k<s[i].length(); k++)
				{
					next = s[i].charAt(k);
					if(c != next) {
						b = false;
							}
					if(b==false&&c==next) {
							gnum--;
							break mid;		
					}		
					
				}		
				
			}						
		}
		System.out.println(gnum);
		sc.close();
	}
}
