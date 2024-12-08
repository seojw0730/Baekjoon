package baekjoon.step10;

import java.util.*;
import java.io.*;

public class B14215 {
	public static int solution(int[] arr) {
		Arrays.sort(arr);
		int a = arr[0], b = arr[1], c = arr[2];
		if(a + b <= c) {
			return 2 * (a + b) - 1;
		}else {
			return a + b + c;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(input1[i]);
		}
		bw.append(String.valueOf(solution(arr))).close();
	}
}