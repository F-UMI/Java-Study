package chap13_Generic_Type.sec04.exam01_generic_method;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = Util.boxing("홍길동");
        String name = box2.get();
        System.out.println(name);
    }
}
