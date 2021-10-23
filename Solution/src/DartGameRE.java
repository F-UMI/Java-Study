/**
 * fileName :DartGameRe
 * author : Yunsup Shin
 * date : 2021-10-23
 * description : 1차 다트게임(5) | https://programmers.co.kr/learn/courses/30/lessons/17682 | DartGame.java 수정본 // 답 맞음
 * 스타상 효과의 중첩구현과 charAt을 이용하기에 점수값이 10일경우 예외 처리하는 경우때문에 애를 먹었다.
 * 사실 매우 간단한거였다.
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-23 Yunsup Shin 최초 생성
 */
public class DartGameRE {
    public int solution(String dartResult) {
        int answer = 0, index = 0;
        int[] scores = new int[3];
        for (int i = 0; i < dartResult.length(); i++){
            char value = dartResult.charAt(i);
            int drLength = dartResult.length();
            if(Character.isDigit(value)) {
                System.out.print("i = " + i + "  |   ");
                if(value == '1' && dartResult.charAt(i + 1) == '0') {
                    scores[index] = 10;
                    System.out.println("1.score = 10");
                    i++;
                } else if(value == '0') {
                    scores[index] = 0;
                    System.out.println("1.score = 0");
                } else {
                    scores[index] = Integer.parseInt(String.valueOf(value));
                    System.out.println("1.score = " + value);
                }
            } else if(value == 'S' || value == 'D' || value == 'T') {
                switch (value) {
                    case 'S': {
                        break;
                    }
                    case 'D': {
                        scores[index] = (int) Math.pow(scores[index], 2);
                        break;
                    }
                    case 'T': {
                        scores[index] = (int) Math.pow(scores[index], 3);
                        break;
                    }
                }
                try {
                    if(i + 1 < drLength && Character.isDigit(dartResult.charAt(i + 1))) {
                        index++;
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
                System.out.print("i = " + i + "  |   ");
                System.out.println("2.Bonus = " + value);

            } else if(value == '*' || value == '#') {
                switch (value) {
                    case '*': {
                        scores[index] *= 2;
                        if(0 < index) {
                            scores[index - 1] *= 2;
                        }
                        break;
                    }
                    case '#': {
                        scores[index] *= -1;
                        break;
                    }
                }
                if(i + 4 < drLength && dartResult.charAt(i + 4) == '*') {
                    scores[index] *= 2;
                }
                System.out.print("i = " + i + "  |   ");
                System.out.println("3.option = " + value);
                index++;

            }

        }
        for (int score : scores){
            System.out.println("score = " + score);
            answer += score;
        }
        return answer;

    }

    public static void main(String[] args) {
        DartGameRE dartGamere = new DartGameRE();
        System.out.println(dartGamere.solution("1S*2T*3S"));
    }

}
