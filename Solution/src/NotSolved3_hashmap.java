//Lv_1 완주하지 못한 선수 // https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
// 21.10 .08 효율성 문제로 해쉬 개념 다시 익힌다음 풀어볼것 
class NotSolved3_hashmap{
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        return answer; 
    }
}




//class Solution {
//	public String solution(String[] participant, String[] completion) {
//		String answer = "";
//		int	completeCount = 0;
//		exit: for (int i = 0; i < participant.length; i++) {
//			for (int j = 0; j < completion.length - completeCount; j++) {
//				
//				if (participant[i].equals(completion[j])) {
//					completeCount++;
//					String tmp = "";
//					completion[j] = completion[completion.length-completeCount];
//					completion[completion.length-completeCount] = "";
//					participant[i] = "";
//					System.out.println(completeCount);
//					if (completeCount == completion.length) {
//						break exit;
//					}
//				} 
//			}
//		}
//		for (int i = 0; i < participant.length; i++) {
//			if (participant[i] != "") {
//				answer = participant[i];
//			}
//		}
//		
//		
//		return answer;
//	}
//
//	public static void main(String[] args) {
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = {"leo", "kiki"};
//		Solution sol = new Solution();
//		String str = sol.solution(participant, completion);
//		System.out.println(str);
//	}
//}