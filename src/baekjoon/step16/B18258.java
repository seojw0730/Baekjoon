package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B18258 {
	static Deque<Integer> queue;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		queue=new LinkedList<>();
		StringBuilder sb=new StringBuilder();
		while(n-- > 0) {
			StringTokenizer st=new StringTokenizer(br.readLine(), " ");
			String temp=st.nextToken();
			if(temp.equals("push")) {
				int x=Integer.parseInt(st.nextToken());
				queue.offer(x);
			}else if(temp.equals("pop")) {
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.poll()).append("\n");
			}else if(temp.equals("size")) {
				sb.append(queue.size()).append("\n");
			}else if(temp.equals("empty")) {
				if(queue.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
			}else if(temp.equals("front")) {
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.peek()).append("\n");
			}else {
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.peekLast()).append("\n");
			}
		}
		bw.append(sb).close();
	}
}
