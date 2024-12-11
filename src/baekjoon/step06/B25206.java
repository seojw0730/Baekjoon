package baekjoon.step06;

import java.io.*;

public class B25206 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double sum = 0, div = 0;
		for(int i = 0; i < 20; i++) {
			String[] input1 = br.readLine().split(" ");
			String grade = input1[2];
			double prop = Double.parseDouble(input1[1]);
			if(grade.equals("P")) continue;
			div += prop;
			double score = 0;
			switch(grade) {
				case "A+": score = 4.5; break;
				case "A0": score = 4.0; break;
				case "B+": score = 3.5; break;
				case "B0": score = 3.0; break;
				case "C+": score = 2.5; break;
				case "C0": score = 2.0; break;
				case "D+": score = 1.5; break;
				case "D0": score = 1.0; break;
				default: score = 0; break;
			}
			sum += prop * score;
		}
		br.close();
		bw.append(String.valueOf(sum / div)).close();
	}
}
