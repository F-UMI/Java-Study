//적중률 68.8%  wHY???
class makeWeirdCharacter { 
	public String solution(String s) {
		String answer = "";
		String[] strDivide = s.split(" ");
		String[] token = new String[s.length()];
		String[] tokenSum = new String[strDivide.length];
		int cnt = 0;
		for (int i = 0; i < strDivide.length; i++) {
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
		makeWeirdCharacter sol = new makeWeirdCharacter();
		System.out.println(sol.solution("try hello world"));
	}
}
