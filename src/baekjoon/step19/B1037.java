package baekjoon.step19;

import java.io.*;
import java.util.*;

public class B1037 {
	public static int solution(int n, int[] arr) {
		Arrays.sort(arr);
		return arr[0]*arr[n-1];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine(), " "); br.close();
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		bw.append(String.valueOf(solution(n, arr))).close();
	}
}
