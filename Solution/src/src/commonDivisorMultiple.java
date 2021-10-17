package src;

//Lv1_최대공약수와 최대 공배수 (4) https://programmers.co.kr/learn/courses/30/lessons/12940?language=java
//유클리스 호재법 (다시 풀어보기)
class commonDivisorMultiple {
	public int[] solution(int n, int m) {

		int[] answer = new int[2];
		answer[0] = gcd(n,m);
		answer[1] = lcm(n, m);
		return answer;
	}
	//최대 공약수 
	public static int gcd(int n, int m) {
		while (m > 0) {
			int temp = m;
			m = n % m;
			n = temp;
		}
		return n;

	}
	//최소 공배수
	public static int lcm(int n , int m) {
		return (n * m) / gcd(n, m);
	}
}
	// 최대 공약수 찾는 코드
//		for (int i = 1; i <= limit; i++) {
//			if (n % i == 0 && m % i == 0) {
//				size++;
//			}
//		}
//		int[] commonFactor = new int[size];
//		for (int i = 1; i <= limit; i++) {
//			if (n % i == 0 && m % i == 0) {
//				commonFactor[count] = i;
//				count++;
//			}
//		}
//		answer[0] = commonFactor[commonFactor.length - 1];
//
//		int tmp_N = 0;
//		int tmp_M = 0;
//		for (int i = 1; i <= m; i++) {
//			tmp_N = n * i;
//			System.out.println(tmp_N);
//			for (int j = 1; j <= n; j++) {
//				tmp_M = m * j;
//				System.out.println(tmp_M);
//				if (tmp_N == tmp_M) {
//					answer[1] = tmp_N;
//				}
//			}
//		}

//	public static void main(String[] args) {
//		Solution solution = new Solution();
//		solution.solution(1, 2);
//	}