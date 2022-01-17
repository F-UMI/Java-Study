/*
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Lv1_ 이상한 문자열 만들기 (?) // 공백이 여러개 일경우 해결하지 못한듯? 68.8 / 21.10.07
class CreateStrangeStrings {

  private static final String FIRST_REGEX = " ";
  private static final String SECOND_REGEX = "";

  public String solution(String s) {
    Stream<String> stream = Arrays.stream(s.split(FIRST_REGEX));
  }

  private static String toWeirdString(String[] strings) {
      String weirdString = "";
    for (int i = 0; i < strings.length; i++) {
*/
/*        isEven(i) ? toUpperString(strings[i]) : toLowerString(strings[i]);*//*

    }
  }

  private static boolean isEven(int i) {
    return i % 2 == 0;
  }

  private static String toUpperString(String string) {
    return string.toUpperCase();
  }

  private static String toLowerString(String string) {
    return string.toLowerCase();
  }


*/
/*		String answer = "";
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
		CreateStrangeStrings sol = new CreateStrangeStrings();
		System.out.println(sol.solution("try hello world"));
	}*//*


}
*/
