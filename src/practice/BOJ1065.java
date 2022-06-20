package practice;
import java.util.*;

public class BOJ1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,k;
		int han = 0;
		int buf[] = new int[3];
		n = scanner.nextInt();
		k = n;
		for(int i=1; i<=n; i++) {
			if(0<i && i<100)
				han = i;
			else if(i<1000) {
				buf[0] = i/100;
				buf[1] = i%100/10;
				buf[2] = i%10;
				if(buf[0]-buf[1] == buf[1] - buf[2])
						han++;
			}
			else if(i==1000)
				break;
		}
		System.out.println(han);
		scanner.close();
	}
}
	
