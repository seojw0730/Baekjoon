package solvedac.class1;

import java.io.*;

public class B2547 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		while(t>0) {
			if(br.readLine().equals("")) t--;
			long n=Long.parseLong(br.readLine());
			long sum=0;
			for(int i=0; i<n; i++) {
				sum+=Long.parseLong(br.readLine());
				sum%=n;
			}
			if(sum==0) sb.append("YES");
			else sb.append("NO");
			sb.append("\n");
		}
		bw.append(sb).close();
	}
}
