package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B2164 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		Queue<Integer> queue=new LinkedList<>();
		for(int i=1; i<=n; i++) queue.offer(i);
		boolean isOdd=true;
		while(queue.size()>1) {
			if(isOdd) queue.poll();
			else queue.offer(queue.poll());
			if(isOdd) isOdd=false;
			else isOdd=true;
		}
		bw.append(String.valueOf(queue.poll())).close();
	}
}
