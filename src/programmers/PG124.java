package programmers;

import java.util.Stack;


class Solution {

 public static String solution(int n) {
    int num =3; 
    int temp=0;
    int p=1; // 자릿수
        while(true){
            if(n<=num){
                break;
            }else{
                for(int j=0;j<p;j++)
                    temp = num*num;
              num = num+ temp; 
              p++;  
            }
        }
        Stack<Character> stack = new Stack<>();
        
        for(int i=p;i>0;i--) {
        	int term=3;
        	int tmp=0;
        	int g;
        	g= func(n,i);
        	stack.push((char)g);
        	if(i==2)
        		term = 3;
        	else {
        	for(int j=0;j<i-1;j++) {
        		term= term*3;
        	}
        	tmp += term;
        	}
        	if(g=='4')
        		g=3;
        	else
        		g= g-'0';
        	
        	n -= g*term;
        }
        
        char[] ans = new char[p];
        for(int i=0;i<stack.size(); i++)
        	{
        	ans[i]= stack.get(i);
        	}
        String answer = new String(ans);

        return answer;
    }
    public static char func(int n, int p){
        int temp=1; 
        int num=0;  // p-1 자리수가 나타내는 값의 범위 
        int val=1;
        
        if(p>=2) {
        for(int i=0; i<p-1;i++){
            temp = temp *3;
            num +=  temp;     
        }
        	n = n-num;   
        while(true){
            if(n<=temp)
                break;
            else
                n -= temp;
                val++; 
        }}else
        	val = n;
        
        switch(val){
                case 1:
                    return '1';
                case 2:
                    return '2';
                case 3:
                    return '4';
            default:
                return '0';
        }
    }
}