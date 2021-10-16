//Lv1_숫자 문자열과 영단어- 2021 카카오채용연계형 인턴쉽 // 21.10. 16 //https://programmers.co.kr/learn/courses/30/lessons/81301
//40점?
class Number_String_EnglishWord {
    public int solution(String s) {
        int answer = 0;
        int[] array = new int[s.length()];
        int index = 0;
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < s.length(); i++) {
            System.out.print("i = " + i + "|||");
            if (0 <= s.charAt(i) && s.charAt(i) <= 89) {
                array[index] = Character.getNumericValue(s.charAt(i));
                System.out.println(array[index]);
                index++;
                continue;
            } else {
                //index 상 뒤에있어도 stings[j]에서 해당수가 먼저 나오면 가운데 값 스킵. 2  0 --> 0
                for (int j = 0; j < strings.length; j++) {
                    if (s.indexOf(strings[j], i) != -1) {
                        array[index] = j;
                        System.out.println("j = " + j);
                        System.out.println(array[index]);
                        index++;
                        i = i + (strings[j].length() - 1);
                        break;
                    }
                }
                continue;
            }

        }
        String[] tmp = new String[index];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.toString(array[i]);
        }
        String s1 = String.join("", tmp);
        System.out.println(s1);
        answer = Integer.valueOf(s1);
        return answer;
    }

    public static void main(String[] args) {
        Number_String_EnglishWord solution = new Number_String_EnglishWord();
        solution.solution("1zerotwozero3");

    }
}