package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SUAPC2023Summer {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int rank = Integer.parseInt(br.readLine());
			br.close();
			String answer1, answer2;
			switch(rank) {
			case 1: answer1 = "12 "; break;
			case 2: case 3: answer1 = "11 "; break;
			case 4: answer1 = "10 "; break;
			case 5: case 6: case 7: answer1 = "9 "; break;
			case 8: answer1 = "8 "; break;
			case 9: answer1 = "7 "; break;
			case 10: case 11: answer1 = "6 "; break;
			case 12: case 13: answer1 = "5 "; break;
			case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: answer1 = "4 "; break;
			case 23: case 24: case 25: case 26: case 27: answer1 = "3 "; break;
			case 28: answer1 = "2 "; break;
			case 29: case 30: case 31: answer1 = "1 "; break;
			default: answer1 = "0 "; break;
			}
			switch(rank) {
			case 1: answer2 = "1600"; break;
			case 2: answer2 = "894"; break;
			case 3: answer2 = "1327"; break;
			case 4: answer2 = "1311"; break;
			case 5: answer2 = "1004"; break;
			case 6: answer2 = "1178"; break;
			case 7: answer2 = "1357"; break;
			case 8: answer2 = "837"; break;
			case 9: answer2 = "1055"; break;
			case 10: answer2 = "556"; break;
			case 11: answer2 = "773"; break;
			case 12: answer2 = "689"; break;
			case 13: answer2 = "800"; break;
			case 14: answer2 = "264"; break;
			case 15: answer2 = "296"; break;
			case 16: answer2 = "334"; break;
			case 17: answer2 = "468"; break;
			case 18: answer2 = "473"; break;
			case 19: answer2 = "479"; break;
			case 20: answer2 = "510"; break;
			case 21: answer2 = "655"; break;
			case 22: answer2 = "786"; break;
			case 23: answer2 = "428"; break;
			case 24: answer2 = "571"; break;
			case 25: answer2 = "649"; break;
			case 26: answer2 = "728"; break;
			case 27: answer2 = "765"; break;
			case 28: answer2 = "378"; break;
			case 29: answer2 = "111"; break;
			case 30: answer2 = "199"; break;
			case 31: answer2 = "255"; break;
			default: answer2 = "0"; break;
			}
			bw.append(answer1+answer2).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}