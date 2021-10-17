package src;

//Lv1_자연수 뒤집어 배열로 만들기 (5) / 21.10.04
class numBackToArray {
	public long[] solution(long n) {

		long[] answer = {};
		String num = Long.toString(n);
		String[] numDivide = num.split("");
		long[] str = new long[numDivide.length];
		for (int i = 0; i < numDivide.length; i++) {
			str[i] = Long.parseLong(numDivide[i]);
		}
		int j = str.length - 1;

		if (str.length % 2 == 0) {
			for (int i = 0; i < str.length / 2; i++) {
				long tmp = str[i];
				str[i] = str[j];
				str[j] = tmp;
				j--;
				System.out.println(j);
			}
		} else if (str.length % 2 == 1) {
			for (int i = 0; i < (str.length - 1) / 2; i++) {
				long tmp = str[i];
				str[i] = str[j];
				str[j] = tmp;
				j--;
			}
		}
		answer = new long[str.length];
		for (int i = 0; i < str.length; i++) {
			answer[i] = str[i];
			System.out.println(answer[i]);
		}
		return answer;

	}

	public static void main(String[] args) {
		numBackToArray sol = new numBackToArray();
		sol.solution(29484);

	}
}