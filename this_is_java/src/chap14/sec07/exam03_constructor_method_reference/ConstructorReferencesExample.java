package chap14.sec07.exam03_constructor_method_reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

    public static void main(String[] args) {
        Function<String, Member> function = Member::new;
        Member member1 = function.apply("angel");

        BiFunction<String ,String ,Member> biFunction = Member::new;
        Member member2 = biFunction.apply("신천사", "angel");

    }
}
