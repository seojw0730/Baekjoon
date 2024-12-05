package baekjoon.step3;

import java.util.*;
import java.io.*;

public class B25304 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int price = Integer.parseInt(input[0]);
			int num = Integer.parseInt(input[1]);
			sum += price * num;
		}
		br.close();
		if(x == sum) bw.append("Yes");
		else bw.append("No");
		bw.close();
	}
}
