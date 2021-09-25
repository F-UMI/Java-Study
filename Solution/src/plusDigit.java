import java.util.*;
//Lv1_자릿수 더하기
public class plusDigit {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] strCut = str.split("");
        int[] numCut = new int[strCut.length];
        for (int i = 0; i < strCut.length; i++) {
        	numCut[i] =  Integer.valueOf(strCut[i]);
			answer += numCut[i];
		}
        return answer;
    }
}
