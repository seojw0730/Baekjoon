package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 벌집 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			br.close();
			
			if(num == 1) {
				bw.append("1").close();
			}else {
				int count = 0;
				while(true) {
					count++;
					if(seung(count) >= num) {
						break;
					}
				}
				bw.append(String.valueOf(count)).close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int seung(int n) {
		if(n == 1) {
			return 1;
		}else {
			return seung(n-1) + 6 * (n-1);
		}
	}
}