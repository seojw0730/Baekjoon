package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class 긴자리계산 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			BigInteger a = new BigInteger(br.readLine());
			BigInteger b = new BigInteger(br.readLine());
			br.close();
			
			bw.append(String.valueOf(a.add(b)) + "\n")
			.append(String.valueOf(a.subtract(b)) + "\n")
			.append(String.valueOf(a.multiply(b))).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
