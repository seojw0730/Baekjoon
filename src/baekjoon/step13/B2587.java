package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B2587 {
	public static int[] solution(int[] arr) {
		int[] answer = new int[2];
		Arrays.sort(arr);
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		answer[0] = sum / 5;
		answer[1] = arr[2];
		return answer;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		int[] answer = solution(arr);
		StringBuilder sb = new StringBuilder();
		sb.append(answer[0]).append("\n").append(answer[1]);
		bw.append(sb).close();
	}
}
