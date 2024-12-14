package baekjoon.step20;

import java.io.*;
import java.util.*;

public class B24060 {
	private static int[] tmp;
	private static int k, cnt=0, answer=0;
	
	private static void merge_sort(int[] A, int p, int r) {
		if(p<r) {
			int q=(p+r)/2;
			merge_sort(A, p, q);
			merge_sort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	
	private static void merge(int[] A, int p, int q, int r) {
		int i=p, j=q+1, t=0;
		
		while(i<=q && j<=r) {
			if(A[i]<=A[j]) tmp[t++]=A[i++];
			else tmp[t++]=A[j++];
		}
		
		while(i<=q) tmp[t++]=A[i++];
		while(j<=r) tmp[t++]=A[j++];
		
		i=p; t=0;
		while(i<=r) {
			cnt++;
			if(cnt==k) answer=tmp[t];
			A[i++]=tmp[t++];
		}
	}
	
	
	public static int solution(int n, int k, int[] A) {
		merge_sort(A, 0, A.length-1);
		if(cnt<k) answer=-1;
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		tmp=new int[n];
		k=Integer.parseInt(st.nextToken());
		int[] A=new int[n];
		st=new StringTokenizer(br.readLine()); br.close();
		for(int i=0; i<n; i++) A[i]=Integer.parseInt(st.nextToken());
		bw.append(String.valueOf(solution(n, k, A))).close();
	}
}