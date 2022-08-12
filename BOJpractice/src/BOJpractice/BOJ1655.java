package BOJpractice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ1655 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minQueue = new PriorityQueue<>();

		for(int i=1;i<n+1;i++) {
			if(i%2==0) {
				minQueue.add(Integer.parseInt(br.readLine()));
			}else {
			maxQueue.add(Integer.parseInt(br.readLine()));
			}
			if(minQueue.size()!=0&&minQueue.peek()<maxQueue.peek()) {
				maxQueue.add(minQueue.poll());
				minQueue.add(maxQueue.poll());
			}
			bw.write(maxQueue.peek()+"\n");
		}
		
		bw.flush();
	}

}
