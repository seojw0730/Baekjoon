package baekjoon.step05;

import java.io.*;

public class B2675 {
	public static String[] solution(int t, String[][] arr) {
		String[] answer = new String[t];
		for(int i = 0; i < t; i++) {
			int num = Integer.parseInt(arr[i][0]);
			String str = arr[i][1];
			StringBuffer sb = new StringBuffer();
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < num; k++) {
					sb.append(str.charAt(j));
				}
			}
			answer[i] = sb.toString();
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		String[][] arr = new String[t][2];
		for(int i = 0; i < t; i++) {
			String[] input1 = br.readLine().split(" ");
			for(int j = 0; j < 2; j++) {
				arr[i][j] = input1[j];
			}
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
