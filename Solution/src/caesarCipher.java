//Lv1_시저 암호 (10)
class Solution {
	public String solution(String s, int n) {
		String answer = "";
		char[] charArray = new char[s.length()];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = s.charAt(i);
		}

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 32) {
				continue;
			}
			if (charArray[i] >= 65 && charArray[i] <= 90) {
				if ((charArray[i] + n )> 90) {
					int number = (charArray[i] + n) - 91;
					charArray[i] = (char) ('A' + number);
				} else {
					charArray[i] = (char) (charArray[i] + n);
				}
			}
			if (charArray[i] >= 97 && charArray[i] <= 122) {
				if (charArray[i] + n > 122) {
					int number = (charArray[i] + n) - 123;
					charArray[i] = (char) ('a' + number);
				} else {
					charArray[i] = (char) (charArray[i] + n);
				}
			}
		}
		String[] stringArray = new String[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			stringArray[i] = Character.toString(charArray[i]);
		}
		answer = String.join("", stringArray);
		return answer;
	}
}