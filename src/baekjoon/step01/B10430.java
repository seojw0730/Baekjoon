package baekjoon.step01;

import java.util.*;
import java.io.*;

public class B10430 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int a = Integer.parseInt(input1[0]);
		int b = Integer.parseInt(input1[1]);
		int c = Integer.parseInt(input1[2]);
		bw
		.append(String.valueOf((a + b) % c) + "\n")
		.append(String.valueOf(((a % c) + (b % c)) % c) + "\n")
		.append(String.valueOf((a * b) % c) + "\n")
		.append(String.valueOf(((a % c) * (b % c)) % c) + "\n")
		.close();
	}
}
