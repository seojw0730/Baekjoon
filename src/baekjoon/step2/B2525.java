package baekjoon.step2;

import java.util.*;
import java.io.*;

public class B2525 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int a = Integer.parseInt(input1[0]);
		int b = Integer.parseInt(input1[1]);
		int c = Integer.parseInt(br.readLine());
		br.close();
		int time1 = 60 * a + b;
		int time2 = time1 + c;
		if(time2 >= 24 * 60) time2 -= 24 * 60;
		bw.append(String.valueOf(time2 / 60) + " " + String.valueOf(time2 % 60)).close();
	}
}
