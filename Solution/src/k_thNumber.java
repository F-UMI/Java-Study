import java.util.Arrays;
//인덱스 들어가는가 -1 항상 신경써야하는데 그러지 못했다. 코드자체는 맞다.
class k_thNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int k = 0;
		for (int i = 0; i < commands.length; i++) {
			int[] arrCut = Arrays.copyOfRange(array, commands[i][0] -1 , commands[i][1]);
			Arrays.sort(arrCut);
			k = (commands[i][2] - 1);
			answer[i] = arrCut[k]; //answer 이 재정의 가 되지 않아서 그런거 같은데 어떻게 하라고오ㅗ오오오
		}	
		return answer;
	}
	public static void main(String[] args) {
		k_thNumber sol = new k_thNumber();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		for (int i = 0; i < commands.length; i++) {
			System.out.println(sol.solution(array, commands));
			
		}
	}
}