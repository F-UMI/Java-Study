class pickTwoElementAndPlus {
	public int[] solution(int[] numbers) {
		int[] answer = {};
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				answer[i] = numbers[i] + numbers[j];
			}
		}
		return answer;
	}
}