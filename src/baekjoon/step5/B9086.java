package baekjoon.step5;

import java.util.*;
import java.io.*;

public class B9086 {
	public static String[] solution(int t, String[] arr) {
		String[] answer = new String[t];
		for(int i = 0; i < t; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(arr[i].charAt(0)).append(arr[i].charAt(arr[i].length() - 1));
			answer[i] = sb.toString();
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		String[] arr = new String[t];
		for(int i = 0; i < t; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		String[] answer = solution(t, arr);
		for(String s : answer) {
			bw.append(s);
			bw.newLine();
		}
		bw.close();
	}
}
