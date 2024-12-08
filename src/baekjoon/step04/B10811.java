package baekjoon.step04;

import java.util.*;
import java.io.*;

public class B10811 {
	public static void swap(int a, int b, int[] arr) {
		int[] temp = new int[b - a + 1];
		for(int i = 0; i < temp.length; i++) temp[i] = arr[b - i];
		for(int i = 0; i < temp.length; i++) arr[a + i] = temp[i];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = i + 1;
		for(int a = 0; a < m; a++) {
			String[] input2 = br.readLine().split(" ");
			int i = Integer.parseInt(input2[0]) - 1;
			int j = Integer.parseInt(input2[1]) - 1;
			swap(i, j, arr);
		}
		br.close();
		for(int i : arr) bw.append(i + " ");
		bw.close();
	}
}
