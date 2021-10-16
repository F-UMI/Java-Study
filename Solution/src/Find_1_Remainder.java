//Lv1_나머지가 1이되는 숫자 찾기 // 21.10.16 // https://programmers.co.kr/learn/courses/30/lessons/87389?language=java
class Find_1_Remainder {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i ++) {
            if (n % i == 1 ){
                answer = i;
                break;
            }
        }
        return answer;
    }
}