package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 마이크로소프트로고 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			br.close();
			
			bw
			.append("       _.-;;-._" + "\n")
			.append("'-..-'|   ||   |" + "\n")
			.append("'-..-'|_.-;;-._|" + "\n")
			.append("'-..-'|   ||   |" + "\n")
			.append("'-..-'|_.-''-._|")
			.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
