package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WelcometoSMUPC {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			br.close();
			
			while(n > 14) {
				n -= 14;
			}
			
			char answer;
			switch(n) {
			case 1: answer = 'W'; break;
			case 2: answer = 'e'; break;
			case 3: answer = 'l'; break;
			case 4: answer = 'c'; break;
			case 5: answer = 'o'; break;
			case 6: answer = 'm'; break;
			case 7: answer = 'e'; break;
			case 8: answer = 'T'; break;
			case 9: answer = 'o'; break;
			case 10: answer = 'S'; break;
			case 11: answer = 'M'; break;
			case 12: answer = 'U'; break;
			case 13: answer = 'P'; break;
			default: answer = 'C'; break;
			}
			
			bw.append(answer).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
