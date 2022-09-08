package BOJpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10820 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine())!=null
				) {
			int small = 0, big = 0, num = 0, space = 0;
			for(int i=0; i<s.length(); i++) {  //'a'~'z' : 97 ~ 122 / 'A'~'Z' : 65~90 / num:48~57 / space: 32 
				if(s.charAt(i) == ' ') {
					space++;
				}else if((int)s.charAt(i)>=97) {
					small++;
				}else if((int)s.charAt(i)<58) {
					num++;
				}else {
					big++;
				}
			}
			
			System.out.println(small+" "+big+" "+num+" "+space);
		}
		

		
		
	}

}
