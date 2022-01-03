import java.util.Arrays;
import java.util.stream.Collectors;
 // 비밀지도  https://programmers.co.kr/learn/courses/30/lessons/17681?language=java
public class TreasureMap {

  private final static String REGEX = "";
  private final static String TO_ONE = "#";
  private final static String ONE = "1";
  private final static String TO_ZERO = " ";
  private final static String ZERO = "0";

  public String[] solution(int n, int[] arr1, int[] arr2) {
    int length = arr1.length;
    String[] answer = new String[length];
    for (int i = 0; i < length; i++) {
      answer[i] = crackTheCode(toBinary(arr1[i], arr2[i], length));
    }
    return answer;
  }

  private String toBinary(int col, int row, int length) {
    return fillTheLength(Integer.toBinaryString(col | row), length);
  }

  private String fillTheLength(String code, int length) {
    while (code.length() < length) {
      code = ZERO + code;
    }
    return code;
  }

  private String crackTheCode(String code) {
    return Arrays.stream(code.split(REGEX))
        .map(TreasureMap::decipher)
        .collect(Collectors.joining(REGEX));
  }

  private static String decipher(String codeSplit) {
    if (codeSplit.equals(ONE)) {
      return TO_ONE;
    } else {
      return TO_ZERO;
    }
  }


}



