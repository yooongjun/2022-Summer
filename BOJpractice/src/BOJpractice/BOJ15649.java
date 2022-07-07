package BOJpractice;
import java.util.Scanner;

public class BOJ15649 {
	static int[] arr;
	static int m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		m =sc.nextInt();
		boolean parent[] = new boolean[n];
		for(int i=0;i<parent.length;i++) {
			parent[i] = true;
		}
		arr = new int[m];
		func(0,n,parent);
		
		sc.close();

}
	public static void func(int depth,int n,boolean parent[]) {
		if(depth == m) {
			for(int i:arr) {
			System.out.print(i + " ");}
			System.out.println();
			return ;
		}
		for(int j=0;j<parent.length;j++) {
			boolean[] temp = parent.clone();
				if(temp[j]==false)
					continue;
				else
				{
				temp[j] = false;
				arr[depth]= j+1;
				func(depth+1,n,temp);
				}
			
		}
	}	
}