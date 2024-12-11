package solvedac.class1;

import java.util.*;
import java.io.*;

public class B14625 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int startH = Integer.parseInt(st.nextToken());
		int startM = Integer.parseInt(st.nextToken());
		int startTime = 60 * startH + startM;
		st = new StringTokenizer(br.readLine(), " ");
		int endH = Integer.parseInt(st.nextToken());
		int endM = Integer.parseInt(st.nextToken());
		int endTime = 60 * endH + endM;
		int n = Integer.parseInt(br.readLine()); br.close();
		StringBuilder sb;
		int H, M, answer = 0;
		for(int i = startTime; i <= endTime; i++) {
			sb = new StringBuilder();
			H = i / 60;
			M = i % 60;
			if(H < 10) sb.append(0);
			sb.append(H);
			if(M < 10) sb.append(0);
			sb.append(M);
			if(sb.toString().contains(String.valueOf(n))) answer++; 
		}
		bw.append(String.valueOf(answer)).close();
	}
}
