package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B24511 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[][] arr=new int[n][2];
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) arr[i][0]=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) arr[i][1]=Integer.parseInt(st.nextToken());
		Queue<Integer> queue=new LinkedList<>();
		for(int i=n-1; i>=0; i--) {
			if(arr[i][0]==0) {
				queue.offer(arr[i][1]);
			}
		}
		int m=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine(), " ");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<m; i++) {
			int input=Integer.parseInt(st.nextToken());
			queue.offer(input);
			sb.append(queue.poll()).append(" ");
		}
		bw.append(sb).close();
	}
}
