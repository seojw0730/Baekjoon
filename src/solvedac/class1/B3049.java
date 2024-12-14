package solvedac.class1;

import java.io.*;

public class B3049 {
	public static int solution(int n) {
		if(n==3) return 0;
		
		int answer=1;
		for(int i=n; i>n-4; i--) answer*=i;
		for(int i=1; i<=4; i++) answer/=i;
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		bw.append(String.valueOf(solution(n))).close();
	}
}