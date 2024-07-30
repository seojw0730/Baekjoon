package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HIARC {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] hiarc = br.readLine().split(" ");
			br.close();
			int h = Integer.parseInt(hiarc[0]);
			int i = Integer.parseInt(hiarc[1]);
			int a = Integer.parseInt(hiarc[2]);
			int r = Integer.parseInt(hiarc[3]);
			int c = Integer.parseInt(hiarc[4]);
			int num1 = h*i;
			int num2 = a*r*c;
			bw.append(String.valueOf(num1-num2)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}