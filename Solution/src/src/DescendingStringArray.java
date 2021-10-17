package src;

//Lv1_문자열 내림차순으로 배치하기(2) 21.10.09 // https://programmers.co.kr/learn/courses/30/lessons/12917?language=java
class DescendingStringArray {
	public String solution(String s) {

		String answer = "";
		char[] arrayChar = s.toCharArray();
		String upperStirng = "";
		String lowerStirng = "";
		int size = 0;
		int upperCount = 0;

		for (char c : arrayChar) {
			arrayChar[size] = c;
			size++;
		}

		for (int i = 0; i < arrayChar.length; i++) {
			if (Character.isUpperCase(arrayChar[i])) {
				upperCount++;
			}
		}

		for (int i = 0; i < arrayChar.length - 1; i++) {
			for (int j = i + 1; j < arrayChar.length; j++) {
				if (arrayChar[i] < arrayChar[j]) {
					char tmp = arrayChar[i];
					arrayChar[i] = arrayChar[j];
					arrayChar[j] = tmp;
				}
			}
		}
		answer = String.valueOf(arrayChar);
		return answer;
	}


}