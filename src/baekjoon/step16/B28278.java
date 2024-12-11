package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B28278 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack=new Stack<>();
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		while(n-- > 0) {
			st=new StringTokenizer(br.readLine(), " ");
			if(st.countTokens()>1) {
				st.nextToken();
				int x=Integer.parseInt(st.nextToken());
				stack.push(x);
			}else {
				String temp=st.nextToken();
				if(temp.equals("2")) {
					if(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
					else sb.append("-1\n");
				}else if(temp.equals("3")) {
					sb.append(stack.size()).append("\n");
				}else if(temp.equals("4")) {
					if(stack.isEmpty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
				}else {
					if(!stack.isEmpty()) sb.append(stack.peek()).append("\n");
					else sb.append("-1\n");
				}
			}
		}
		br.close();
		bw.append(sb).close();
	}
}
