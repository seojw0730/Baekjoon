package solvedac.class1;

import java.io.*;

public class B21964 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String input1 = br.readLine();
		br.close();
		bw.append(input1.substring(n - 5)).close();
	}
}
