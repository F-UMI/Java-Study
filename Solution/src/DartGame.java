/**
 * fileName :1st DartGame
 * author : Yunsup Shin
 * date : 2021-10-22
 * description : 1차 다트게임 | https://programmers.co.kr/learn/courses/30/lessons/17682 | 81.2점 ?? 예외 사항 뭘까
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-21 Yunsup Shin 최초 생성
 */
class DartGame {

    public int solution(String dartResult) {
        int answer = 0, count = 0;
        int[] scores = new int[3];
        for ( int i = 0; i < dartResult.length(); i++ ) {
            char value = dartResult.charAt(i);
            //1. value이 점수 일경우
            if ( Character.isDigit(value) ) {
                if ( dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0' ) {
                    scores[count] = 10;
                    System.out.print("i = " + i+" ");
                    System.out.println("1. scores = " + scores[count]);
                    i++;
                    continue;
                } else if ( dartResult.charAt(i) == '0' ) {
                    scores[count] = 0;
                    i++;
                    continue;
                }
                scores[count] = Integer.parseInt(String.valueOf(value));
                System.out.print("i = " + i+" ");
                System.out.println("1. value = " + value);
            }
            //2. value이 보너스 일경우
            else if ( value == 'S' || value == 'D' || value == 'T' ) {
                System.out.print("i = " + i+" ");
                System.out.println("2.bonus = " + value);
                switch ( value ) {
                    case 'S': {
                        scores[count] = scores[count] * 1;
                        break;
                    }
                    case 'D': {
                        scores[count] = (int) Math.pow(scores[count], 2);
                        break;
                    }

                    case 'T': {
                        scores[count] = (int) Math.pow(scores[count], 3);
                        break;
                        //
                    }
                }
                try {
                    if ( i + 1 < dartResult.length() ) {
                        if ( Character.isDigit(dartResult.charAt(i + 1)) ) {
                            if ( i + 3 < dartResult.length() && dartResult.charAt(i + 3) == '*' ) {
                                scores[count] *= 2;
                            }

                            count++;
                        } else if ( dartResult.charAt(i + 1) == '*' || dartResult.charAt(i + 1) == '#' ) {
                            continue;
                        }

                    }
                } catch ( Exception e ) {
                    e.printStackTrace();
                }
            }
            //3. value 이 옵션일경우
            else if ( value == '*' || value == '#' ) {
                System.out.print("i = " + i+" ");
                System.out.println("3.option = " + value);
                if ( value == '*' ) {
                    scores[count] *= 2;
                    if ( i + 3 < dartResult.length() )
                        switch ( dartResult.charAt(i + 3) ) {
                            case '*':
                                scores[count] *= 2;
                                break;
                            case '#':
                                scores[count] *= -1;
                                break;

                        }

                    count++;
                } else {
                    scores[count] *= -1;
                    if ( i + 3 < dartResult.length() )
                        switch ( dartResult.charAt(i + 3) ) {
                            case '*':
                                scores[count] *= 2;
                                break;
                            case '#':
                                scores[count] *= -1;
                                break;
                        }
                    count++;
                }
            }


        }
        for ( int score : scores ) {
            System.out.println("score = " + score);
            answer += score;
        }

        return answer;


    }

    public static void main(String[] args) {
        DartGame dartGame = new DartGame();
        System.out.println(dartGame.solution("5S*10S*10"));
    }
}