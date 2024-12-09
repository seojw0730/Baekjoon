package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B11478 {
	public static int solution(String str) {
		int len = 1;
		Set<String> set = new HashSet<>();
		while(len <= str.length()) {
			for(int i = 0; i < str.length() + 1 - len; i++) {
				set.add(str.substring(i, i + len));
			}
			len ++;
		}
		return set.size();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine(); br.close();
		bw.append(String.valueOf(solution(input1))).close();
	}
}
