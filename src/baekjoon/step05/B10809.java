package baekjoon.step05;

import java.io.*;

public class B10809 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		br.close();
		for(int i = 'a'; i <= 'z'; i++) {
			if(input1.contains(String.valueOf((char)i))) {
				bw.append(input1.indexOf((char)i) + " ");
			}else {
				bw.append("-1 ");
			}
		}
		bw.close();
	}
}
