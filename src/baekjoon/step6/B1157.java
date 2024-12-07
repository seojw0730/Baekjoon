package baekjoon.step6;

import java.util.*;
import java.io.*;

public class B1157 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine().toLowerCase();
		br.close();
		int[] num = new int[26];
		for(char c : input1.toCharArray()) {
			int temp = c - 'a';
			num[temp]++;
		}
		int max = 0, answer = 0;
		for(int i = 0; i < 26; i++) {
			if(num[i] > max) {
				max = num[i];
				answer = i + 'a';
			}
		}
		int cnt = 0;
		for(int i : num) {
			if(i == max) {
				cnt++;
				if(cnt > 1) {
					break;
				}
			}
		}
		if(cnt > 1) bw.append("?");
		else bw.append(Character.toUpperCase((char)answer));
		bw.close();
	}
}
