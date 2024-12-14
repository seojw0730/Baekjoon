package baekjoon.step20;

import java.io.*;

public class B2447 {
	public static void print(char[][] arr, int i0, int i3, int j0, int j3) {
		if(i3-i0>=3) {
			int increment=(i3-i0)/3;
			int i1=i0+increment, i2=i1+increment;
			int j1=j0+increment, j2=j1+increment;
			for(int i=i0; i<i3; i++) {
				for(int j=j0; j<j3; j++) {
					if(i<i1) {
						arr[i][j]='*';
					}else if(i<i2) {
						if(j<j1) arr[i][j]='*';
						else if(j<j2) arr[i][j]=' ';
						else arr[i][j]='*';
					}else {
						arr[i][j]='*';
					}
				}
			}
			for(int i=i0; i<i3; i+=increment) {
				for(int j=j0; j<j3; j+=increment) {
					if(!(i==i1 && j==j1)) {
						print(arr, i, i+increment, j, j+increment);
					}
				}
			}
		}
	}
	
	public static char[][] solution(int n){
		char[][] arr=new char[n][n];
		print(arr, 0, n, 0, n);
		return arr;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		char[][] answer=solution(n);
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				sb.append(answer[i][j]);
			}
			sb.append("\n");
		}
		bw.append(sb).close();
	}
}
