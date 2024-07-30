package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 분해합 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			br.close();
			int answer = 0;
			for(int i = num; i > 0; i--) {
				int temp = 0;
				String iStr = String.valueOf(i);
				for(int j = 0; j < iStr.length(); j++) {
					temp += Integer.parseInt(String.valueOf(iStr.charAt(j)));
				}
				if((temp + i) == num) {
					answer = i;
				}
			}
			bw.append(String.valueOf(answer)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}