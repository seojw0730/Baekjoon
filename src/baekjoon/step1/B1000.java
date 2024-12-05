package baekjoon.step1;

import java.util.*;
import java.io.*;

public class B1000 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int a = Integer.parseInt(input1[0]);
		int b = Integer.parseInt(input1[1]);
		bw.append(String.valueOf(a + b)).close();
	}
}
