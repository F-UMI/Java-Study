//Lv_1 콜라츠 추측  num 의 범위로 테스트 3 오류?
public class CollatzSuggestion {

    public int solution(double num) {
        int answer = 0;

        while (true) {
            if (num == 1) {
                return answer;
            } else if (answer > 500) {
                answer = -1;
                break;
            }
            answer++;
            num = isEven(num) ? num / 2 : num * 3 + 1;
        }
        return answer;
    }

    private boolean isEven(double number) {
        return number % 2 == 0;
    }
}