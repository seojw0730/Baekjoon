package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 이루수이름이뭐야 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			boolean isAnj = false;
			for(int i = 0; i < n; i++) {
				String s = br.readLine();
				if(s.equals("anj")) {
					isAnj = true;
				}
			}
			br.close();
			
			if(isAnj) {
				bw.append("뭐야;");
			}else {
				bw.append("뭐야?");
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
