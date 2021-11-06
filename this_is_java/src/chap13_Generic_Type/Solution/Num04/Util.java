package chap13_Generic_Type.Solution.Num04;

public class Util {
/*    public static <K,V> V getValue(Pair<K, V> pair,K k) {
        if(pair.getKey().equals(k)) {
            return pair.getValue();
        } else {
            return null;
        }

    }*/

    public static <P extends Pair<K,V>,K, V> V getValue(P p, K k) {
        if(p.getKey().equals(k)) {
            return p.getValue();
        } else {
            return null;
        }
    }
}
