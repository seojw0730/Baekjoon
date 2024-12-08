package baekjoon.step10;

import java.util.*;
import java.io.*;

public class B5073 {
	public static String solution(int[] arr) {
		Arrays.sort(arr);
		int a = arr[0], b = arr[1], c = arr[2];
		if(a + b <= c) return "Invalid";
		if(a == b && b == c) {
			return "Equilateral";
		}else if(a == b || b == c || c == a) {
			return "Isosceles";
		}else {
			return "Scalene";
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr;
		StringBuilder sb = new StringBuilder();
		while(true) {
			String[] input1 = br.readLine().split(" ");
			arr = new int[3];
			for(int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(input1[i]);
			}
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			sb.append(solution(arr)).append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}