import java.util.ArrayDeque;
import java.util.Queue;

public class ternaryConversion {

  public int solution(int n) {
    int answer = 0;
    Queue<Integer> saveTheRest = new ArrayDeque<>();
   return Integer.parseInt( divideToTernary(saveTheRest, n), 3);
  }

  private String divideToTernary(Queue<Integer> queue, int n) {
    String convertedValue = "";
    while (n != 0) {
      queue.add(n % 3);
      n = n / 3;
    }
    for (Integer pith : queue) {
      convertedValue += String.valueOf(pith);
    }
    return convertedValue;
  }
}
