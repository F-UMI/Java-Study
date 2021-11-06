package chap13_Generic_Type.sec02.exam02_generic_type;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("홍길동");
        String name = box.get();

        Box<Integer> box1 = new Box<Integer>();
        box1.set(6);
        int value = box1.get();
    }
}
