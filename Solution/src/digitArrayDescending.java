//Lv1_정수 내림차순으로 정리하기
class digitArrayDescending {
	public long solution(long n) {
		long answer = 0;
		String num = Long.toString(n);
		String[] numDivide = num.split("");
		long[] str = new long[numDivide.length];
		for (int i = 0; i < numDivide.length; i++) {
			str[i] = Long.parseLong(numDivide[i]);
		}
		
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				changeIndex(str, i, j);
			}
			System.out.print(str[i]);
		}
		for (int i = 0; i < str.length; i++) {
			numDivide[i] = Long.toString(str[i]);
		}
		num = String.join("", numDivide); 
		answer = Long.valueOf(num);
		return answer;
	}
	// 내림차순 정렬
	public void changeIndex(long[] array, int indexA, int indexB) {
		if (array[indexA] < array[indexB]) {
			long tmp = array[indexA];
			array[indexA] = array[indexB];
			array[indexB] = tmp;
		}

	}
}