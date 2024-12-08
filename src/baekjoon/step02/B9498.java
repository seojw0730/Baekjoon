package baekjoon.step02;

import java.util.*;
import java.io.*;

public class B9498 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input1 = Integer.parseInt(br.readLine());
		br.close();
		if(input1 >= 90) bw.append("A");
		else if(input1 >= 80) bw.append("B");
		else if(input1 >= 70) bw.append("C");
		else if(input1 >= 60) bw.append("D");
		else bw.append("F");
		bw.close();
	}
}
