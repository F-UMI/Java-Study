
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * fileName :recommend_New_ID
 * author : Yunsup Shin
 * date : 2021-10-24
 * description : 신규 아이디 추천 | https://programmers.co.kr/learn/courses/30/lessons/72410
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-24 Yunsup Shin 최초 생성
 */


class recommend_New_ID {
    public String solution(String new_id) {
        Pattern pattern = Pattern.compile("[a-z0-9_.-]");
        String answer = "";

        //1.소문자로 치환 V
        new_id = new_id.toLowerCase();
        String[] idArray = new_id.split("");
        String[] tmp = new String[idArray.length];
        System.out.println("new_id = " + new_id);

        //2.특정 문자 제거 V
        int count = 0;
        for (int i = 0; i < idArray.length; i++){
            Matcher matcher = pattern.matcher(idArray[i]);
            if(matcher.matches()) {
                tmp[count] = idArray[i];
                count++;
            }
        }
        for (int i = 0; i < tmp.length; i++){
            if(tmp[i] == null) {
                break;
            }
            answer += tmp[i];

        }
        System.out.println("2.new_id = " + answer);

        //3. 마침표 연속 제외 V
        String[] period = answer.split("\\.");
        answer = "";
        for (int i = 0; i < period.length; i++){
            if(period[i].isEmpty()) {
                continue;
            }else{
               if(i == 0) {
                   answer += period[i];
               }
               else {
                   answer += "." + period[i];
               }
            }
        }
        System.out.println("3.new_id = " + answer);

        //4. 마침표 처음 끝 제외
        idArray = answer.split("");
        if(idArray[0].equals(".")) {
            idArray[0] = "";
        }
        if(idArray[idArray.length - 1].equals(".")) {
            idArray[idArray.length - 1] = "";
        }
        answer = String.join("", idArray);
        System.out.println("4.new_id = " + answer);

        //5.빈문자열
        if(answer.isEmpty()) {
            answer = "a";
        }
        System.out.println("5.new_id = " + answer);

        //6. 16자 이상
        if(answer.length() >= 16) {
            if(answer.charAt(14) == '.') {
                answer = answer.substring(0,14);
            }
            else {
                answer = answer.substring(0,15);
            }

        }
        System.out.println("6.new_id = " + answer);

        //7.id길이 2장 이하
        if(answer.length() <= 2) {
            for (int i = 0; i < 3; i++){
                if(answer.length() == 3) {
                    break;
                }
                answer += String.valueOf(answer.charAt(answer.length() - 1));
            }
        }
        System.out.println("7.new_id = " + answer);
        return answer;
    }


    public static void main(String[] args) {
        recommend_New_ID solution = new recommend_New_ID();
        System.out.println(solution.solution("abcdefghijklmn.p"));
    }
}