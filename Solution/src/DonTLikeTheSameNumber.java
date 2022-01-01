import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;
import java.util.*;
import java.util.stream.IntStream;

public class DonTLikeTheSameNumber {

  public Object[] solution(int[] arr) {
    IntStream stream = Arrays.stream(arr);
    Stack<Integer> solutionStack = new Stack<>();
    stream.filter(value -> isSameNumber(value, solutionStack)).forEach(solutionStack::push);
    Object[] result = solutionStack.toArray();

    return result;
/*        int[] answer = new int[arr.length];
        answer[0] = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(answer[count] != arr[i]) {
                count++;
            }
        }
        answer = new int[count];
        answer[0] = arr[0];
        count = 0;
        for (int i = 0; i < arr.length; i++){
            if(answer[count] != arr[i]) {
                count++;
                answer[count] = arr[i];
            }
        }
        for (int i = 0; i <answer.length; i++){
            System.out.println(answer[i]);
        }
        return answer;*/
  }

  public static boolean isSameNumber(int value, Stack<Integer> stack) {
    return stack.peek() == value;
  }
}
