package chap13_Generic_Type.sec04.exam01_generic_method;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
