package baekjoon.step4;

import java.util.*;
import java.io.*;

public class B10818 {
	public static int[] solution(int n, int[] arr) {
		int[] answer = new int[2];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i : arr) {
			if(i < min) min = i;
			if(i > max) max = i;
		}
		answer[0] = min;
		answer[1] = max;
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] input1 = br.readLine().split(" ");
		br.close();
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(input1[i]);
		int[] answer = solution(n, arr);
		for(int i : answer) bw.append(i + " ");
		bw.close();
	}
}
