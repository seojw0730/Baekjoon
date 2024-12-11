package baekjoon.step18;

import java.io.*;
import java.util.*;

public class B11050 {
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine(), " "); br.close();
		int n=Integer.parseInt(st.nextToken());
		arr=new int[n+1];
		arr[0]=arr[1]=1;
		for(int i=2; i<=n; i++) arr[i]=arr[i-1]*i;
		int k=Integer.parseInt(st.nextToken());
		int answer=0;
		if(k==0 || k==n) answer=1;
		else answer=arr[n]/(arr[n-k]*arr[k]);
		bw.append(String.valueOf(answer)).close();
	}
}
