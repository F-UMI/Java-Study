
//Lv1_ 제일 작은수 제거하기 
//제일 작은수가 여러개 있을 경우 ex 1이 3개 일때 3개를 모두 없애야 하기 때문?
//내일 다시 풀기
import java.util.Arrays;

class Solution {
	public int[] solution(int[] arr) {
		int[] answer = {};
		if (arr.length < 2) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}

		}
		answer = new int[arr.length - 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
			System.out.println(answer[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1,4,5,6,7,2,3,5 , 5, 1 };
		Solution sol = new Solution();
		sol.solution(arr);
	}
}
