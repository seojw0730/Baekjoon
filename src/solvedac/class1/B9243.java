package solvedac.class1;

import java.io.*;

public class B9243 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String input1=br.readLine();
		String input2=br.readLine(); br.close();
		boolean success=true;
		if(n%2==0) {
			for(int i=0; i<input1.length(); i++) {
				if(input1.charAt(i)!=input2.charAt(i)) {
					success=false;
					break;
				}
			}
		}else {
			for(int i=0; i<input1.length(); i++) {
				if(input1.charAt(i) == input2.charAt(i)) {
					success=false;
					break;
				}
			}
		}
		if(success) bw.append("Deletion succeeded");
		else bw.append("Deletion failed");
		bw.close();
	}
}