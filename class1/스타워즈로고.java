package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 스타워즈로고 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			br.close();
			bw
			.append("    8888888888  888    88888\n")
			.append("   88     88   88 88   88  88\n")
			.append("    8888  88  88   88  88888\n")
			.append("       88 88 888888888 88   88\n")
			.append("88888888  88 88     88 88    888888\n")
			.append("\n")
			.append("88  88  88   888    88888    888888\n")
			.append("88  88  88  88 88   88  88  88\n")
			.append("88 8888 88 88   88  88888    8888\n")
			.append(" 888  888 888888888 88  88      88\n")
			.append("  88  88  88     88 88   88888888\n")
			.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}