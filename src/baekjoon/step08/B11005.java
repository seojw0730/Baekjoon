package baekjoon.step08;

import java.util.*;
import java.io.*;

public class B11005 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int n = Integer.parseInt(input1[0]);
		int b = Integer.parseInt(input1[1]);
		bw.append(Integer.toString(n, b).toUpperCase()).close();
	}
}