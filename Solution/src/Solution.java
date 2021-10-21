class Solution {

    public int solution(String dartResult) {
        int answer = 0, count = 0;
        int scores[] = new int[3];
        String dartResultArray[] = new String[dartResult.length()];

        for ( int i = 0; i < dartResult.length(); i++ ) {
            char value = dartResult.charAt(i);
            //1. value이 점수 일경우
            if ( Character.isDigit(value) ) {
                scores[count] = (int) value;
                System.out.println("1. value = " + value);
            }
            //2. value이 보너스 일경우
            else if ( value == 'S' || value == 'D' || value == 'T' ) {
                System.out.println("2.value = " + value);
                switch ( value ) {
                    case 'S': {
                        scores[count] *= scores[count] * 1;
                        break;
                    }
                    case 'D': {
                        scores[count] = (int) Math.pow(scores[count], 2);
                        break;
                    }

                    case 'T': {
                        scores[count] = (int) Math.pow(scores[count], 3);
                        break;
                    }
                }
                if ( i + 1 < dartResult.length() ) {
                    if ( Character.isDigit(dartResult.charAt(i + 1)) ) {
                        count++;
                    } else if ( dartResult.charAt(i + 1) == '*' || dartResult.charAt(i + 1) == '#' ) {
                        continue;
                    }
                }
            }
            //3. value 이 옵션일경우
            else if ( value == '*' || value == '#' ) {
                System.out.println("3.value = " + value);
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
}