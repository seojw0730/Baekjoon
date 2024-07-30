package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 수찾기 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			br.readLine();
			String[] strArr1 = br.readLine().split(" ");
			br.readLine();
			String[] strArr2 = br.readLine().split(" ");
			br.close();
			
			String str1 = null;
			for(int i=0; i<strArr1.length; i++) {
				str1 += strArr1[i];
			}
			
			for(int i=0; i<strArr2.length; i++) {
				if(str1.contains(strArr2[i])) {
					bw.append(String.valueOf(1) + "\n");
				}else {
					bw.append(String.valueOf(0) + "\n");
				}
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}