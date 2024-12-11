package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B2346 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()), idx=0;
		int[] arr1=new int[n];
		for(int i=0; i<n; i++) arr1[i]=i+1;
		StringTokenizer st=new StringTokenizer(br.readLine()); br.close();
		int[] arr2=new int[n];
		for(int i=0; i<n; i++) arr2[i]=Integer.parseInt(st.nextToken());
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(arr1[idx]);
			arr1[idx]=0;
			if(i<n-1) sb.append(" ");
			if(i==n-1) break;
			int temp=arr2[idx];
			for(int j=0; j<Math.abs(temp); j++) {
				if(temp>0) {
					idx++;
					if(idx==n) idx-=n;
				}else {
					idx--;
					if(idx==-1) idx+=n;
				}
				if(arr1[idx]==0) j--;
			}
		}
		bw.append(sb).close();
	}
}
