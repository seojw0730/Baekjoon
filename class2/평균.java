package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 평균 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			// 과목 수
			String numStr = br.readLine();
			int num = Integer.parseInt(numStr);
			
			// 과목 점수 배열
			String[] scoreStrArr = br.readLine().split(" ");
			
			// 과목 점수 오름차순 정렬
			List<Integer> scoreList = new ArrayList<Integer>();
			for(String s : scoreStrArr) {
				scoreList.add(Integer.parseInt(s));
			}
			Collections.sort(scoreList);
			
			// 과목 점수 오름차순 배열
			int[] scoreArr = new int[scoreList.size()];
			for(int i = 0; i < scoreList.size(); i++) {
				scoreArr[i] = scoreList.get(i);
			}
			
			int max = scoreArr[num-1]; // 가장 높은 점수
			int sum = 0;
			for(int i = 0; i < num; i++) {
				sum += scoreArr[i]; // 변환된 총점
			}
			bw.append(String.valueOf(100*(sum/(double)(max*num))));
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}