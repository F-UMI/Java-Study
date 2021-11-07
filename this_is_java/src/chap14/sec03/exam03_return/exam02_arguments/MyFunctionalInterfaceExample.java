package chap14.sec03.exam03_return.exam02_arguments;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;
        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> {
            return x + y;
        };
        System.out.println(fi.method(2,5));

        fi = (x, y) -> sum(x, y); // return 값이 method의 값이 된다
        System.out.println(fi.method(2,5));


    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
