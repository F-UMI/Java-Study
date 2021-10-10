//Lv_1 x만큼  간격있는 n개의 숫자 (4)  //  https://programmers.co.kr/learn/courses/30/lessons/12954
class Spaced_By_X_Number {
	static long constants;
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		constants = x;
			for (int i = 1; i <= n; i++) {
				answer[i-1] = constants * i;
			}


			return answer;
	}
}