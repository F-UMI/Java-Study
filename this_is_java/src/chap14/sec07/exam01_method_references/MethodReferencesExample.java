package chap14.sec07.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        //정적 메스드 참조
        operator = (left, right) -> Calculator.staticMethod(left,right);
        System.out.println("결과1:" + operator.applyAsInt(1,2));

        operator = Calculator ::staticMethod;
        System.out.println("결과1:" + operator.applyAsInt(3,4));

        Calculator obj = new Calculator();
        operator = (left, right) -> obj.instanceMethod(left,right);
        System.out.println("결과1:" + operator.applyAsInt(5,6));

        operator = obj::instanceMethod;
        System.out.println("결과1:" + operator.applyAsInt(7,8));
    }
}
