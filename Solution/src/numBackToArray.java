//Lv1_자연수 뒤집어 배열로 만들기
class numBackToArray {
    public long[] solution(long n) {

        long[] answer = {};
		String num = Long.toString(n);
		String[] numDivide = num.split("");
		long[] str = new long[numDivide.length];
		for (int i = 0; i < numDivide.length; i++) {
			str[i] = Long.parseLong(numDivide[i]);
		}
		
		for (int i = 0; i < str.length ; i++) {
			for (int j = i + 1; j < str.length; j++) {
				changeIndex(str, i, j);
			}
            System.out.println(str[i]);
		}
        answer = new long[str.length];
        for(int i = 0; i <str.length; i++) {
            answer[i] = str[i];
        }
        return answer;
            
        
}
    public void changeIndex(long[] array, int indexA, int indexB) {
		if (array[indexA] < array[indexB]) {
			long tmp = array[indexA];
			array[indexA] = array[indexB];
			array[indexB] = tmp;
		}

	}
    public static void main(String[] args) {
		
	}
}