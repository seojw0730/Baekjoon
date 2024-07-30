package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팰린드롬수 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			while(true) {
				String num = br.readLine();
				if(num.equals("0")) break;
				
				char[] original = new char[num.length()];
				for(int i = 0; i < original.length; i++) {
					original[i] = num.charAt(i);
				}
				
				char[] reverse = new char[num.length()];
				for(int i = 0; i < reverse.length; i++) {
					reverse[i] = num.charAt(reverse.length - 1 - i);
				}
				
				int count = 0;
				for(int i = 0; i < num.length(); i++) {
					if(original[i] == reverse[i]) {
						count++;
					}
				}
				
				if(count == num.length()) {
					bw.append(String.valueOf("yes") + "\n");
				}else {
					bw.append(String.valueOf("no") + "\n");
				}
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}