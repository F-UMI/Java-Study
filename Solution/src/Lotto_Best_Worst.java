/**
 * fileName : Lotto_Best_Worst
 * author : Yunsup Shin
 * date : 2021-10-20
 * description : 로또의 최고순위와 최저순위(6) | https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-20 Yunsup Shin 최초 생성
 */

class Lotto_Best_Worst {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int correctNumberCount = 0;
        for ( int i = 0; i < lottos.length; i++ ) {
            if ( lottos[i] == 0 ) {
                zeroCount++;
                continue;
            } else {
                for ( int j = 0; j < win_nums.length; j++ ) {
                    if ( lottos[i] == win_nums[j] ) {
//                        System.out.println("lottos[i] = " + lottos[i]);
//                        System.out.println("win_nums[j] = " + win_nums[j]);
                        correctNumberCount++;
                        break;
                    }

                }
            }
        }
//        System.out.println("correctNumberCount = " + correctNumberCount);
//        System.out.println("zeroCount = " + zeroCount);

        if ( correctNumberCount < 2 ) {
            answer[1] = 6;
        } else if ( correctNumberCount == 2 ) {
            answer[1] = 5;
        } else if ( correctNumberCount == 3 ) {
            answer[1] = 4;
        } else if ( correctNumberCount == 4 ) {
            answer[1] = 3;
        } else if ( correctNumberCount == 5 ) {
            answer[1] = 2;
        } else if ( correctNumberCount == 6 ) {
            answer[1] = 1;
        }
        answer[0] = answer[1] - zeroCount;

        if ( zeroCount == 6 ) {
            answer[0] = 1;
            answer[1] = 6;
        }
        return answer;


    }


}