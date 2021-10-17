package src;

//Lv_1 콜라츠 추측  num 의 범위로 테스트 3 오류?
public class CollatzSuggestion {
	public int solution(double num) {
        int answer = 0;
        if (num == 1) {
            answer = 0;
        }
        
		while (num!= 1) {
		if (answer >= 500) {
			answer = -1;
		}
		num = (num % 2 ==0) ? (num/2) : (num*3 +1);
        answer++;
		}
		
		return answer;
	}

}