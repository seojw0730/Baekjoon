package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B9012 {
	public static String solution(String str) {
		Stack<Character> stack=new Stack<>();
		for(char c : str.toCharArray()) {
			if(c=='(') stack.push(c);
			else {
				if(stack.isEmpty()) return "NO";
				else stack.pop();
			}
		}
		if(stack.size()>0) return "NO";
		return "YES";
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		while(t-- > 0) {
			String temp=br.readLine();
			sb.append(solution(temp)).append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}
