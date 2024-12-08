package baekjoon.step01;

import java.util.*;
import java.io.*;

public class B11382 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		long a = Long.parseLong(input1[0]);
		long b = Long.parseLong(input1[1]);
		long c = Long.parseLong(input1[2]);
		bw.append(String.valueOf(a + b + c)).close();
	}
}
