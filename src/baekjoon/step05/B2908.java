package baekjoon.step05;

import java.util.*;
import java.io.*;

public class B2908 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int a1 = Integer.parseInt(input1[0]);
		int b1 = Integer.parseInt(input1[1]);
		StringBuffer sb = new StringBuffer(String.valueOf(a1)).reverse();
		int a2 = Integer.parseInt(sb.toString());
		sb = new StringBuffer(String.valueOf(b1)).reverse();
		int b2 = Integer.parseInt(sb.toString());
		bw.append(String.valueOf(Math.max(a2, b2))).close();
	}
}
