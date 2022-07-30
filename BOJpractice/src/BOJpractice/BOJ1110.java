package BOJpractice;

import java.io.*;
import java.util.*;

public class BOJ1110{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));       
int N = Integer.parseInt(br.readLine());
int x = N;
int p,q;
int cnt = 0;
int sum = 0;
while(true){
p = x/10;
q = x%10;    
sum = p + q;
x = sum%10 + 10*q;    
cnt++;
if(N==x){
    break;
}
}
System.out.println(cnt);


}
}