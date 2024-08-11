package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 제리와톰 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] pq = br.readLine().split(" ");
			int p = Integer.parseInt(pq[0]);
			int q = Integer.parseInt(pq[1]);
			br.close();
			
			bw.append(String.valueOf(q-p) + " " + String.valueOf(q)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
