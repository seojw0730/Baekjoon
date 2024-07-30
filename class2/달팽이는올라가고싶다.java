package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 달팽이는올라가고싶다 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] nums = br.readLine().split(" ");
			br.close();
			
			int up = Integer.parseInt(nums[0]);
			int down = Integer.parseInt(nums[1]);
			int height = Integer.parseInt(nums[2]);
			
			int day = 1;
			while(true) {
				height -= up;
				if(height <= 0) {
					break;
				}else {
					height += down;
				}
				
				day++;
			}
			
			bw.append(String.valueOf(day)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}