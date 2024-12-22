package baekjoon.step21;

import java.io.*;
import java.util.*;

public class B14888 {
	static int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
	static int[] arr1;
	
	public static void dfs(int L, int n, int result, int[] arr2) {
		if(L==n) {
			max=Math.max(max, result);
			min=Math.min(min, result);
		}else {
			for(int i=0; i<4; i++) {
				if(arr2[i]>0) {
					arr2[i]--;
					switch(i) {
						case 0: dfs(L+1, n, result+arr1[L], arr2); break;
						case 1: dfs(L+1, n, result-arr1[L], arr2); break;
						case 2: dfs(L+1, n, result*arr1[L], arr2); break;
						default: dfs(L+1, n, result/arr1[L], arr2); break;
					}
					arr2[i]++;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		arr1=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		int[] arr2=new int[4];
		st=new StringTokenizer(br.readLine()); br.close();
		for(int i=0; i<4; i++) {
			arr2[i]=Integer.parseInt(st.nextToken());
		}
		dfs(1, n, arr1[0], arr2);
		bw.append(max+"\n"+min).close();
	}
}