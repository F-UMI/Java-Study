package chap14.sec05.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

    public static void main(String[] args) {
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null null:"+ predicate.test(null));

        predicate = Predicate.isEqual("JAVA8");
        System.out.println("null JAVA8:"+ predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("null JAVA8:"+ predicate.test("JAVA8"));

        predicate = Predicate.isEqual("JAVA8");
        System.out.println("JAVA8 JAVA8:"+ predicate.test("JAVA8"));
    }
}
