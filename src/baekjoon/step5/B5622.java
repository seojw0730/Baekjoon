package baekjoon.step5;

import java.util.*;
import java.io.*;

public class B5622 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		br.close();
		int answer = 0;
		for(char c : input1.toCharArray()) {
			if(c >= 'A' && c <= 'C') answer += 3;
			else if(c >= 'D' && c <= 'F') answer += 4;
			else if(c >= 'G' && c <= 'I') answer += 5;
			else if(c >= 'J' && c <= 'L') answer += 6;
			else if(c >= 'M' && c <= 'O') answer += 7;
			else if(c >= 'P' && c <= 'S') answer += 8;
			else if(c >= 'T' && c <= 'V') answer += 9;
			else answer += 10;
		}
		bw.append(String.valueOf(answer)).close();
	}
}
