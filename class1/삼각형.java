package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 삼각형 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] wh = br.readLine().split(" ");
			br.close();
			int width = Integer.parseInt(wh[0]);
			int height = Integer.parseInt(wh[1]);
			bw.append(String.valueOf(width*height/(double)2)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}