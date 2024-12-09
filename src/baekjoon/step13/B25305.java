package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B25305 {
	public static int solution(int N, int k, int[] arr) {
		Arrays.sort(arr);
		return arr[N - k];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		int k = Integer.parseInt(input1[1]);
		int[] arr = new int[N];
		String[] input2 = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		bw.append(String.valueOf(solution(N, k, arr))).close();
	}
}
