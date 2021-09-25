//Lv1_정수 내림차순으로 정리하기
class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        String[] numDivide = num.split("");
        long[] str = new long[numDivide.length];
        for (int i = 0; i < numDivide.length; i++) {
			str[i] = Long.valueOf(numDivide[i]);
		}
        for (int j = 0; j < str.length-1; j++) {
			if (str[j] <str[j+1]) {
				long tmp = 0;
				tmp = str[j];
				str[j] = str[j+1];
				str[j+1] = tmp;
			}
			numDivide[j] = Long.toString(str[j]);
		}
        answer = String.join("",numDivide); // 분류작업 내일 다시
        
        
        return answer;
    }
}