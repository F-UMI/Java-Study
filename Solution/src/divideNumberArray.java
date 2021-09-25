import java.util.Arrays;
//Lv1_나누어 떨어지는 숫자 배열 
class divideNumberArray {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				cnt++;
			}
		}
		answer = new int[cnt];
		for (int j = 0, k = 0; j < arr.length; j++) {
			if (arr[j] % divisor == 0) {
				answer[k] = arr[j];
				k++;
			}
		}
		if (cnt == 0) {
			answer = new int[1];
			answer[0] = -1;
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		divideNumberArray sol = new divideNumberArray();
		sol.solution(arr, divisor);
	}

}