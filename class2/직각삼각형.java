package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 직각삼각형 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			while(true) {
				String[] nums = br.readLine().split(" ");
				// 세 변의 길이
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);
				int c = Integer.parseInt(nums[2]);
				
				// 세 변의 길이 오름차순 정렬
				List<Integer> intList = new ArrayList<Integer>();
				intList.add(a);
				intList.add(b);
				intList.add(c);
				Collections.sort(intList);
				
				// 세 변의 길이가 작은 것부터 큰 순으로
				a = intList.get(0);
				b = intList.get(1);
				c = intList.get(2);
				
				// 0 0 0 입력 시 종료
				if(a == 0) {
					br.close();
					bw.close();
					break;
				}
				
				// 피타고라스 정리 만족하면
				if((a*a)+(b*b)==(c*c)) {
					bw.append("right");
					bw.newLine();
					bw.flush();
				}
				// 피타고라스 정리 만족하지 못하면
				else {
					bw.append("wrong");
					bw.newLine();
					bw.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}