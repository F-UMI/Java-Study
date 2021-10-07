//Lv1_소수 찾기 ( ?) / 시간복잡도 해결로 인한 해결 x / 21.10.07
class NotSolved {
	public int solution(int n) {
		int answer = 0;
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				continue;
			}
			int count = 0;
			for (int j = 1; j <= i; j++) {
				
			}
		}
		
		
		return answer;
	}

}


// 아래 식은 맞지만 시간 복잡도가  n^2 이기에 적합하지 ㅇ낳다.
//for (int i = 1; i <= n; i++) {
//	if (i == 1) {
//		continue;
//	}
//	int count = 0;
//	for (int j = 1; j <= i; j++) {
//		if (i % j == 0) {
//			count++;
//		}	
//	}
//	if (count == 2) {
//		answer++;
//	}
//}