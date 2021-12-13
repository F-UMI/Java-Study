//Lv1_ 이상한 문자열 만들기 (?) // 공백이 여러개 일경우 해결하지 못한듯? 68.8 / 21.10.07
class NotSolved2 { 
	public String solution(String s) {
		String answer = "";
		String[] strDivide = s.split(" ");
		String[] token = new String[s.length()];
		String[] tokenSum = new String[strDivide.length];
		int cnt = 0;
		for (int i = 0; i < strDivide.length; i++) {
			for (int j = 0; j < strDivide[i].length(); j++) {
				if (strDivide[i].charAt(j) == 32) {
					continue;
				}
				
			}
			token = strDivide[i].split("");
			System.out.println(token);
			for (int j = 0; j < strDivide[i].length(); j++) {
				if (j == 0 || j % 2 == 0) {
					token[j] = token[j].toUpperCase();
				}
				if (j % 2 != 0) {
					token[j] = token[j].toLowerCase();
				}
				
			}
			tokenSum[i] = String.join("", token);

		}
		answer = String.join(" ", tokenSum);
		return answer;
	}

	public static void main(String[] args) {
		NotSolved2 sol = new NotSolved2();
		System.out.println(sol.solution("try hello world"));
	}
}
