import java.util.*;

public class DonTLikeTheSameNumber {
    public int[] solution(int[] arr) {

        int[] answer = new int[arr.length];
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
        return answer;
    }

    public static void main(String[] args) {
        DonTLikeTheSameNumber solution = new DonTLikeTheSameNumber();
        int arr[] = {1, 1, 3, 3, 0, 1, 1};
        solution.solution(arr);
    }
    
}
