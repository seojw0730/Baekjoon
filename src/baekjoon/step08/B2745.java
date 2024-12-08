package baekjoon.step08;

import java.util.*;
import java.io.*;

public class B2745 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		String n = input1[0];
		int b = Integer.parseInt(input1[1]);
		bw.append(String.valueOf(Integer.parseInt(n, b))).close();
	}
}