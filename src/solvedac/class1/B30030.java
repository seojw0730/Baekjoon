package solvedac.class1;

import java.io.*;

public class B30030 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int b = Integer.parseInt(br.readLine());
		br.close();
		b = b * 10 / 11;
		bw.append(String.valueOf(b)).close();
	}
}
