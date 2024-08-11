package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 이별은무슨색일까 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			br.close();
			
			String color = null;
			
			if(n >= 380) {
				color = "Violet";
			}
			if(n >= 425) {
				color = "Indigo";
			}
			if(n >= 450) {
				color = "Blue";
			}
			if(n >= 495) {
				color = "Green";
			}
			if(n >= 570) {
				color = "Yellow";
			}
			if(n >= 590) {
				color = "Orange";
			}
			if(n >= 620) {
				color = "Red";
			}
			
			bw.append(color).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
