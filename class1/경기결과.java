package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 경기결과 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			for(int i = 0; i < num; i++) {
				String[] strArr = br.readLine().split(" ");
				int ascore = Integer.parseInt(strArr[0]);
				int bscore = Integer.parseInt(strArr[1]);
				if(ascore > bscore) {
					a++;
				}else if(ascore < bscore) {
					b++;
				}
			}
			br.close();
			bw.append(String.valueOf(a) + " " + String.valueOf(b)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}