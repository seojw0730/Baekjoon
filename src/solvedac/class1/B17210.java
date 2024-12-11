package solvedac.class1;

import java.io.*;

public class B17210 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		long input1 = Long.parseLong(br.readLine()); br.close();
		StringBuilder sb = new StringBuilder();
		if(n < 6) {
			if(input1 == 0) {
				for(long i = 0; i < n - 1; i++) {
					if(i % 2 == 0) {
						sb.append(1).append("\n");
					}else {
						sb.append(0).append("\n");
					}
				}
			}else {
				for(long i = 0; i < n - 1; i++) {
					if(i % 2 == 0) {
						sb.append(0).append("\n");
					}else {
						sb.append(1).append("\n");
					}
				}
			}
		}else {
			sb.append("Love is open door");
		}
		bw.append(sb).close();
	}
}
