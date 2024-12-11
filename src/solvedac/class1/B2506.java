package solvedac.class1;

import java.util.*;
import java.io.*;

public class B2506 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int[] score = new int[n];
		if(arr[0] == 1) score[0] = 1;
		for(int i = 1; i < n; i++) {
			if(arr[i] == 1) {
				if(score[i - 1] > 0) {
					score[i] = score[i - 1] + 1;
				}else {
					score[i] = 1;
				}
			}
		}
		int sum = 0;
		for(int i : score) sum += i;
		bw.append(String.valueOf(sum)).close();
	}
}
