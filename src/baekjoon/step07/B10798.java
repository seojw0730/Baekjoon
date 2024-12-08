package baekjoon.step07;

import java.util.*;
import java.io.*;

public class B10798 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr = new char[5][15];
		for(int i = 0; i < 5; i++) {
			String input1 = br.readLine();
			for(int j = 0; j < input1.length(); j++) {
				arr[i][j] = input1.charAt(j);
			}
		}
		br.close();
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				char temp = arr[j][i];
				if(temp != '\u0000') bw.append(arr[j][i]);
			}
		}
		bw.close();
	}
}