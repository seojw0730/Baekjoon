package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B10773 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int k=Integer.parseInt(br.readLine()), answer=0;
		Stack<Integer> stack=new Stack<>();
		while(k-- > 0) {
			int n=Integer.parseInt(br.readLine());
			if(n==0) {
				stack.pop();
			}else {
				stack.push(n);
			}
		}
		br.close();
		for(int i : stack) answer+=i;
		bw.append(String.valueOf(answer)).close();
	}
}
