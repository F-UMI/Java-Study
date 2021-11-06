package chap13_Generic_Type.sec04.exam02_generic_method;

public class Util {
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
        //2개의 pare 객체 사용 K와 V의 값이 모두 true 일때 true 리턴 아닌경우 false
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
