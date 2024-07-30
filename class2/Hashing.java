package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hashing {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int len = Integer.parseInt(br.readLine());
			String words = br.readLine();
			br.close();
			int[] word = new int[words.length()];
			for(int i = 0; i < words.length(); i++) {
				word[i] = words.charAt(i) - 96;
			}
			
			for(int i = 0; i < word.length; i++) {
				for(int j = 0; j < i; j++) {
					word[i] *= 31;
				}
			}
			
			int answer = 0;
			for(int i = 0; i < word.length; i++) {
				answer += word[i];
			}
			
			bw.append(String.valueOf(answer)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}