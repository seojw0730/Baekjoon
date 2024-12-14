package solvedac.class1;

import java.io.*;
import java.util.*;

public class B28281 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int x=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		int min=Integer.MAX_VALUE;
		for(int i=0; i<n-1; i++) {
			int temp=x*(arr[i]+arr[i+1]);
			min=Math.min(min, temp);
		}
		bw.append(String.valueOf(min)).close();
	}
}
