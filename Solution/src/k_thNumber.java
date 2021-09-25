import java.util.Arrays;
//Lv1_k번째 수
//인덱스 들어가는가 -1 항상 신경써야하는데 그러지 못했다. copyofRange의 시작인덱스에서 ArrayOutOfRangeException 발생, -1 추가하여 방지함
class k_thNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int k = 0;
		for (int i = 0; i < commands.length; i++) {
			int[] arrCut = Arrays.copyOfRange(array, commands[i][0] -1 , commands[i][1]);
			Arrays.sort(arrCut);
			k = (commands[i][2] - 1);
			answer[i] = arrCut[k]; 
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