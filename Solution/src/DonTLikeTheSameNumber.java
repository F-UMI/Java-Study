import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;
import java.util.*;
import java.util.stream.IntStream;

public class DonTLikeTheSameNumber {
  public Object[] solution(int[] arr) {
    IntStream stream = Arrays.stream(arr);
    Stack<Integer> solutionStack = new Stack<>();
    solutionStack.push(arr[0]);
    stream.filter(value -> isSameNumber(value, solutionStack)).forEach(solutionStack::push);
    Object[] result = solutionStack.toArray();
    return result;

  }

  public static boolean isSameNumber(int value, Stack<Integer> stack) {
    return stack.peek() != value;
  }
}
