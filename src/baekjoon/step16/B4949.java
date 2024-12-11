package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B4949 {
	public static String solution(String str) {
		Stack<Character> stack=new Stack<>();
		for(char c : str.toCharArray()) {
			if(c=='(' || c=='[') stack.push(c);
			else {
				if(c==')') {
					if(stack.isEmpty()) return "no";
					else {
						if(stack.peek()!='(') return "no";
						else stack.pop();
					}
				}
				if(c==']') {
					if(stack.isEmpty()) return "no";
					else {
						if(stack.peek()!='[') return "no";
						else stack.pop();
					}
				}
			}
		}
		if(stack.size()>0) return "no";
		return "yes";
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		String temp;
		while(true) {
			temp=br.readLine();
			if(temp.equals(".")) break;
			sb.append(solution(temp)).append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}
