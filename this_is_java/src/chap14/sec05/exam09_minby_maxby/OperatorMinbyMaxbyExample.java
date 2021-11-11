package chap14.sec05.exam09_minby_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinbyMaxbyExample {
    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;
        Fruit fruit;

        binaryOperator = BinaryOperator.minBy((o1, o2) -> Integer.compare(o1.price, o2.price));
        fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
        System.out.println(fruit.name);

        binaryOperator = BinaryOperator.maxBy((o1, o2) -> Integer.compare(o1.price, o2.price));
        fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
        System.out.println(fruit.name);
    }
}
