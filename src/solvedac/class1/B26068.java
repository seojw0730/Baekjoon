package solvedac.class1;

import java.io.*;

public class B26068 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int answer=0;
		while(n-- > 0) {
			int input1=Integer.parseInt(br.readLine().substring(2));
			if(input1<=90) answer++;
		}
		bw.append(String.valueOf(answer)).close();
	}
}
