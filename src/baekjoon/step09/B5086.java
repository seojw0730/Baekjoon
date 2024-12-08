package baekjoon.step09;

import java.util.*;
import java.io.*;

public class B5086 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] input1 = br.readLine().split(" ");
			int a = Integer.parseInt(input1[0]);
			int b = Integer.parseInt(input1[1]);
			if(a == 0 && b == 0) break;
			if(b % a == 0) bw.append("factor");
			else if(a % b == 0) bw.append("multiple");
			else bw.append("neither");
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}