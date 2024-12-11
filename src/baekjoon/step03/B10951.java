package baekjoon.step03;

import java.io.*;

public class B10951 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String input1 = br.readLine();
			if(input1 == null) break;
			String[] arr = input1.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			bw.append((a + b) + "\n");
		}
		br.close();
		bw.close();
	}
}
