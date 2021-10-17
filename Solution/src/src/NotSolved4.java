package src;

class NotSolved4 {
	public int[] solution(int[] numbers) {
    	int size = 0;
        for (int i = 1; i <= numbers.length; i++) {
			size += i;
		}
        int[] answer = new int[size];
        size = 0;
        answer[0] = numbers[0] + numbers[1];
        if (numbers.length == 2) {
			return answer;
		}
        for (int i = 0; i < numbers.length -1; i++) {
			for (int j = 0; j < size ; j++) {
				if (answer[j] != numbers[i] + numbers[i+1]) {
					answer[j] = numbers[i] + numbers[i+1];
					System.out.print(answer[size] + ",");
					size++;
				}
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		NotSolved4 sol = new NotSolved4();
		int[] numbers = {2,1,3,4,1};
		sol.solution(numbers);
	}
}