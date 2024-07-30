package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 히스토그램 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			for(int i = 0; i < num; i++) {
				int a = Integer.parseInt(br.readLine());
				for(int j = 0; j < a; j++) {
					bw.append("=");
				}
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}