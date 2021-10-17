package src;

//Lv1_수박수박수박수박수박수? 21.10.11 // https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
class WaterMelon {
    public String solution(int n) {
        String answer = "";
        
        for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer = answer + "수";
			}
			else {
				answer = answer +"박";
			}
		}
        return answer;
    }
}