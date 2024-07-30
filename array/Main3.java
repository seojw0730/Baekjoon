package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String ns = br.readLine();
		int n = Integer.parseInt(ns);

		String s = br.readLine();
		st = new StringTokenizer(s);

		int min = 1000000;
		int max = -1000000;

		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(st.nextToken());
			if (min > t) {
				min = t;
			}
			if (max < t) {
				max = t;
			}
		}

		if (min < -1000000) {
			min = -1000000;
		}
		if (max > 1000000) {
			max = 1000000;
		}

		bw.write(min + " " + max);
		bw.close();

//		int[] arrInt = new int[n];
//
//		for (int i = 0; i < arrInt.length; i++) {
//			arrInt[i] = Integer.parseInt(st.nextToken());
//		}

//		for (int i = 0; i < arrInt.length; i++) {
//			bw.write(arrInt[i] + "/");
//		}
//		bw.write("\n");

//		for (int i = 0; i < arrInt.length; i++) {
//			bw.write(arrInt[i] + "/");
//		}
//		bw.write("\n");

//		int min = 0;
//		int max = 0;
//
//		for (int i = 0; i < arrInt.length - 1; i++) {
//			if (arrInt[i] < arrInt[i + 1]) {
//				max = arrInt[i + 1];
//			}
//		}
//		for (int i = 0; i < arrInt.length - 1; i++) {
//			if (arrInt[i] > arrInt[i + 1]) {
//				min = arrInt[i + 1];
//			}
//		}

//		bw.write(arrInt[0] + " " + arrInt[arrInt.length - 1]);
//		bw.close();
	}
}