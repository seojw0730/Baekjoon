package baekjoon.step02;

import java.util.*;
import java.io.*;

public class B14681 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		br.close();
		if(x > 0 && y > 0) bw.append("1");
		else if(x < 0 && y > 0) bw.append("2");
		else if(x < 0 && y < 0) bw.append("3");
		else bw.append("4");
		bw.close();
	}
}
