package chap13_Generic_Type.sec05.exam01_bounded_type;

public class BoundedTypeExample {
    public static void main(String[] args) {
        int result1 = Util.compare(10, 20);
        System.out.println("result1 = " + result1);

        int result2 = Util.compare(4.5, 3);
        System.out.println("result2 = " + result2);
    }
}
