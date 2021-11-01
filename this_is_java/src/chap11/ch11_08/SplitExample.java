package chap11.ch11_08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str ="아이디,이름,패스워드";
		String[] strSplit = str.split(",");
		for (int i = 0; i < strSplit.length; i++) {
			System.out.println(strSplit[i]);
		}
			System.out.println();
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	
	}
}
