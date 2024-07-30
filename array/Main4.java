package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			sb.append(br.readLine() + " ");
		}
		StringTokenizer st = new StringTokenizer(sb.toString());
		int max = 1;
		int count = 0;

		int[] arrInt = new int[9];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < arrInt.length; i++) {
			if (max < arrInt[i]) {
				max = arrInt[i];
				count = i + 1;
			}
		}

		bw.write(max + "\n");
		bw.write(count + "\n");
		bw.close();
	}
}