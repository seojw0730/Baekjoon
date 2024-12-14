package baekjoon.step20;

import java.io.*;

public class B4779 {
	private static void sort(char[] A, int p, int s) {
		if(s-p>=3) {
			int q=p+(s-p)/3, r=q+(s-p)/3; 
			for(int i=p; i<s; i++) {
				if(i<q) A[i]='-';
				else if(i<r) A[i]=' ';
				else A[i]='-';
			}
			sort(A, p, q);
			sort(A, r, s);
		}
	}
	
	public static String solution(char[] A) {
		if(A.length==1) return "-";
		
		sort(A, 0, A.length);
		StringBuilder sb=new StringBuilder();
		for(char c : A) sb.append(c);
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String input1;
		while((input1=br.readLine())!=null) {
			int n=Integer.parseInt(input1);
			char[] A=new char[(int)Math.pow(3, n)];
			bw.append(solution(A));
			bw.newLine();
			bw.flush();
		}
	}
}