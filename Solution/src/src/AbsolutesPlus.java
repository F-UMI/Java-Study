package src;

//Lv1_음양 더하기(1) 21.10.10 //https://programmers.co.kr/learn/courses/30/lessons/76501
class AbsolutesPlus {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i] == true) {
				continue;
			}
			if (signs[i] == false) {
				absolutes[i] = absolutes[i] * (-1);
			}
		}
		for (int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i];
		}

		return answer;
	}
}