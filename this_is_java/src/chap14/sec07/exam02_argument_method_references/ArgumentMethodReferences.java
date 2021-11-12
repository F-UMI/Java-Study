package chap14.sec07.exam02_argument_method_references;

import java.util.function.ToIntBiFunction;


public class ArgumentMethodReferences {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (s, s2) -> s.compareToIgnoreCase(s2);
        System.out.println(function.applyAsInt("Java8", "JAVA8"));

        function = String::compareToIgnoreCase;
        System.out.println(function.applyAsInt("Java8", "JAVA8"));

    }

    public static void print(int order) {
        if(order < 0) {
            System.out.println("사전순 먼저");
        } else if(order == 0) {
            System.out.println("동일한 문자열입니다");
        } else {
            System.out.println("사전순 나중");
        }
    }

}
