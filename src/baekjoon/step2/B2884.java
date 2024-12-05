package baekjoon.step2;

import java.util.*;
import java.io.*;

public class B2884 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int h = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int time1 = 60 * h + m;
		int time2 = time1 - 45;
		if(time2 < 0) time2 += 24 * 60;
		bw.append(String.valueOf(time2 / 60) + " " + String.valueOf(time2 % 60)).close();
	}
}
