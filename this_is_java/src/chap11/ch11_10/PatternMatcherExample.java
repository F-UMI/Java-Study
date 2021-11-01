package chap11.ch11_10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regexp ="[a-zA-z]\\w{8,12}";
        boolean isMatch = Pattern.matches(regexp, id);
        if(isMatch) {
            System.out.println("ID로 사용할수 있습니다");
        } else {
            System.out.println("ID로 사용할 수 없습니다");
        }
    }
}
