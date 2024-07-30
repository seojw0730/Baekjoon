package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팬들에게둘러싸인홍준 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String id = br.readLine();
			br.close();
			
			bw.append(":fan::fan::fan:");
			bw.newLine();
			bw.append(":fan::"+id+"::fan:");
			bw.newLine();
			bw.append(":fan::fan::fan:");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}