package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B28279 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		Deque<Integer> deque=new LinkedList<>();
		while(n-- > 0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String temp=st.nextToken();
			switch(temp) {
			case "1": deque.offerFirst(Integer.parseInt(st.nextToken())); break;
			case "2": deque.offerLast(Integer.parseInt(st.nextToken())); break;
			case "3":
				if(!deque.isEmpty()) sb.append(deque.pollFirst());
				else sb.append(-1);
				sb.append("\n");
				break;
			case "4":
				if(!deque.isEmpty()) sb.append(deque.pollLast());
				else sb.append(-1);
				sb.append("\n");
				break;
			case "5": sb.append(deque.size()).append("\n"); break;
			case "6":
				if(deque.isEmpty()) sb.append(1);
				else sb.append(0);
				sb.append("\n");
				break;
			case "7":
				if(!deque.isEmpty()) sb.append(deque.peekFirst());
				else sb.append(-1);
				sb.append("\n");
				break;
			default:
				if(!deque.isEmpty()) sb.append(deque.peekLast());
				else sb.append(-1);
				sb.append("\n");
				break;
			}
		}
		bw.append(sb).close();
	}
}
