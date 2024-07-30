package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 영화감독숌 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			br.close();
			
			int answer = 666;
			while(true) {
				if(String.valueOf(answer).contains("666")) {
					if(n == 1) {
						break;
					}else {
						n--;
					}
				}
				answer++;
			}
			
			bw.append(String.valueOf(answer)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}