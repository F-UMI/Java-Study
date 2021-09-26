//Lv1_하샤드 수
public class harshadNum  {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        String[] strSplit = str.split("");
        int[] digit = new int[strSplit.length];
        int digitSum = 0;
        for (int i = 0; i < strSplit.length; i++) {
			digit[i] =Integer.parseInt(strSplit[i]);
			digitSum += digit[i];
        }
        if(x % digitSum == 0) {
        	answer = true;
        }
        else {
			answer = false;
		}
        return answer;
    }
}
