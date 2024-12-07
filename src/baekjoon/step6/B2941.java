package baekjoon.step6;

import java.util.*;
import java.io.*;

public class B2941 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		br.close();
		int answer = 0;
		for(int i = 0; i < input1.length(); i++) {
			char c = input1.charAt(i);
			
			if(c == 'c') {
				if(i < input1.length() - 1) {
					char temp = input1.charAt(i + 1);
					if(temp == '=' || temp == '-') {
						i++;
					}
				}
			}
			if(c == 'd') {
				if(i < input1.length() - 2 && input1.charAt(i + 1) == 'z' && input1.charAt(i + 2) == '=') {
					i += 2;
				}
				if(i < input1.length() - 1 && input1.charAt(i + 1) == '-') {
					i++;
				}
			}
			if(c == 'l' && i < input1.length() - 1 && input1.charAt(i + 1) == 'j') {
				i++;
			}
			if(c == 'n' && i < input1.length() - 1 && input1.charAt(i + 1) == 'j') {
				i++;
			}
			if(c == 's' && i < input1.length() - 1 && input1.charAt(i + 1) == '=') {
				i++;
			}
			if(c == 'z' && i < input1.length() - 1 && input1.charAt(i + 1) == '=') {
				i++;
			}
			answer++;
		}
		bw.append(String.valueOf(answer)).close();
	}
}
