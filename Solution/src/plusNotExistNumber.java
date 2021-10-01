//Lv1_없는 숫자 더하기 (1)
class plusNotExistNumber {
	public int solution(int[] numbers) {
		int answer = -1;
		int totalNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			totalNumbers += numbers[i];
		}
		answer = 45 - totalNumbers;
		return answer;
	}
}
