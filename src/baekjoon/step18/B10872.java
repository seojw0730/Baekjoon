package baekjoon.step18;

import java.io.*;

public class B10872 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		long[] arr=new long[n+1];
		arr[0]=1;
		if(n>0) arr[1]=1;
		for(int i=2; i<=n; i++) {
			arr[i]=arr[i-1]*i;
		}
		bw.append(String.valueOf(arr[n])).close();
	}
}
