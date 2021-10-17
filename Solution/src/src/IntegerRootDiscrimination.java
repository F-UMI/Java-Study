package src;

//Lv1_정수 제곱근 판별(4)
class IntegerRootDiscrimination {
	public long solution(long n) {
		long answer = 0;
		for (long i = 1; i < Long.MAX_VALUE; i++) {
			long comparisonNumber = i * i;
			if (n == comparisonNumber) {
				answer = (i + 1) * (i + 1);
			}
			else if (n!= comparisonNumber && comparisonNumber > n) {
				answer = -1;
				break;
			}
		}
		return answer;
	}
}