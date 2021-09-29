//Lv1_ 문자열 다루기
class handleStringBasic {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() < 4 || s.length() > 6) {
			answer = false;
		}
        else {
			answer = true;
		}
       try {
		int ex = Integer.parseInt(s);
	} catch (NumberFormatException e) {
		answer = false;
	}
        return answer;
    }
}