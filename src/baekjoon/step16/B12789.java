package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B12789 {
	public static String solution(int n, int[] arr) {
		Stack<Integer> stack=new Stack<>();
		int recent=1;
		for(int i=0; i<n; i++) {
			if(arr[i]==recent) recent++;
			else {
				if(!stack.isEmpty() && stack.peek()==recent) {
					stack.pop();
					recent++;
					i--;
				}else {
					stack.push(arr[i]);
				}
			}
		}
		while(!stack.isEmpty()) {
			if(stack.pop()==recent) recent++;
			else return "Sad";
		}
		return "Nice";
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		bw.append(solution(n, arr)).close();
	}
}
