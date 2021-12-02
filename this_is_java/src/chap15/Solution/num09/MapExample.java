package chap15.Solution.num09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MapExample {

  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null;
    int maxScore = 0;
    int totalScore = 0;

    Set<String> set = map.keySet();
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      Integer value = map.get(key);
      totalScore += value;
      if (value >= maxScore)  {
        maxScore = value;
        name = key;
      }
    }
    System.out.println("평균점수:" + totalScore / map.size());
    System.out.println("최고 점수:" + maxScore);
    System.out.println("최고점수를 받은 아이디:" + name);

  }

}
