package baekjoon.step20;

import java.io.*;

public class B25501 {
	static int cnt;
	
	public static long recursion(String s, int l, int r) {
		cnt++;
		if(l>=r) return 1;
		else if(s.charAt(l)!=s.charAt(r)) return 0;
		else return recursion(s, l+1, r-1);
	}
	
	public static long isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		long t=Long.parseLong(br.readLine());
		StringBuilder sb=new StringBuilder();
		while(t-- > 0) {
			String temp=br.readLine();
			cnt=0;
			sb.append(isPalindrome(temp)).append(" ").append(cnt).append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}