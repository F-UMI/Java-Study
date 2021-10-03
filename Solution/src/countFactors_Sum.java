//Lv_1 약수의 개수와 덧셈 (3) 21.10,03
class countFactors_Sum {
	public int solution(int left, int right) {
		rightCondition(left, right);
		int answer = 0;
		int[] answerArray = new int[right - left + 1];

		// left 와 right 사이의 값을 배열에 할당하여 저장하는 코드
		for (int i = 0; i < answerArray.length - 1; i++) {
			answerArray[0] = left;
			answerArray[i + 1] = answerArray[i] + 1;
		}
		for (int i = left; i <= right; i++) {
			if (countFactors(i) % 2 == 0) {
				continue;
			}
			if (countFactors(i) % 2 == 1) {
				makeMinusNum(answerArray, i);
			}
		}
		answer = ArraySum(answerArray);
		return answer;
	}

	// 배열의 합을 return 하는 method
	public int ArraySum(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}

	// 약수의 개수를 return 하는 method
	public int countFactors(int value) {
		int count = 0;
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				count++;
			}
		}
		return count;
	}

	// 특정 index의 배열 값을 음수로 만드는 method
	public void makeMinusNum(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				array[i] = array[i] * (-1);
			}

		}
	}
	//제한사항 검사하는 method
	public void rightCondition(int left, int right) {
		if (left < 1 || right > 1000) {
			System.out.println("제한사항을 벗어났습니다.");
			System.exit(1);
		}

	}
	//test
	public static void main(String[] args) {
		countFactors_Sum solution = new countFactors_Sum();
		System.out.println(solution.solution(24, 27));

	}
}