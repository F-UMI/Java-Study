package chap14.Solution.num05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores){
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((left, right) -> {
            if(left <= right) {
            return right;
            }
            return left;
        });
        System.out.println("최대값" + max);

        int min = maxOrMin((left, right) -> {
            if(left >= right) {
                return right;
            }
            return left;
        });
        System.out.println("최솟값" + min);
    }

}
