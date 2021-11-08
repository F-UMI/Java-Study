package chap14.sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s + "8");
        consumer.accept("java");

        BiConsumer<String, String> biConsumer = (s, s2) -> System.out.println(s + s2);
        biConsumer.accept("Java", "8");

        DoubleConsumer doubleConsumer = value -> System.out.println("java" + value);
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (s, value) -> System.out.println(s + value);
        objIntConsumer.accept( "Java",8);


    }
}
