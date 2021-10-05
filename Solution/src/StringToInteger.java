//Lv1_문자열을 숫자로 바꾸기(1)  /  https://programmers.co.kr/learn/courses/30/lessons/12925?language=java
import java.util.regex.Pattern;
class Solution {
	public int solution(String s) {
		if (s.charAt(0) == '0') {
			System.exit(1);
		}

		int answer = 0;
		String tmp = "";
		String regExp = "^[0-9]+$";
		if (s.charAt(0) == '+') {
			tmp = s.substring(1, s.length() - 1);
			answer = Integer.valueOf(tmp);
		} else if (s.matches(regExp)) {
			answer = Integer.valueOf(s);
		} else if (s.charAt(0) == '-') {
			tmp = s.substring(1, s.length() - 1);
			answer = -Integer.valueOf(tmp);
		}

		return answer;
	}
}