package baekjoon.step4;

import java.util.*;
import java.io.*;

public class B10871 {
	public static Integer[] solution(int n, int x, int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			if(i < x) list.add(i);
		}
		return list.toArray(new Integer[list.size()]);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int x = Integer.parseInt(input1[1]);
		int[] arr = new int[n];
		String[] input2 = br.readLine().split(" ");
		br.close();
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		Integer[] answer = solution(n, x, arr);
		for(int i : answer) bw.append(i + " ");
		bw.close();
	}
}
