package chap15.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); //key 값 동일 시 중복 X

        System.out.println("총 Entry 수:"+map.size() );

        System.out.println("홍길동:" + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key  = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry 수:"+map.size() );

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t"+ key + ":" +value);
        }
        map.clear();
        System.out.println("총 Entry 수:"+map.size() );
    }
}
