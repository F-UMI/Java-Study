
//포기 나중으로 미루자
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class deleteMimimumNumber {
    public int[] solution(int[] arr) {

    	int length = arr.length;
    	int[] answer = new int[length];
        if (length == 1) {
			answer[0] = -1;
			return answer;
		}
        int elementToDelete = 0;
        Integer[] ListArray = new Integer[length];
        for (int i = 0; i < arr.length-1; i++) {
        	ListArray[i] = arr[i];
        	if (arr[i] < arr[i+1]) {
				elementToDelete = arr[i];
			}
		}
        for (int i = 0; i < answer.length; i++) {
			if (arr[i] == elementToDelete) {
				ListArray = removeElementUsingCollection(ListArray, i);
			}
		}
        for (int i = 0; i < ListArray.length; i++) {
			answer[i] = ListArray[i];
		}
        
        
        return answer;
    }
    
    public static Integer[] removeElementUsingCollection( Integer[] arr, int index ){
        List<Integer> tempList = new ArrayList<Integer>(Arrays.asList(arr));
        tempList.remove(index);
        return tempList.toArray(new Integer[0]);
    }
}
















//class Solution {
//	public int[] solution(int[] arr) {
//		int[] answer = {};
//		int length = arr.length;
//		if (length == 1) {
//			answer = new int[1];
//			answer[0] = -1;
//			return answer;
//		}
//		int minNum = 0;
//		for (int i = 0; i < length - 1; i++) {
//			if (arr[i] < arr[i + 1]) {
//				minNum = arr[i];
//			}
//		}
//		for (int j = 0; j < length; j++) {
//			if (arr[j] == minNum) {
//				int tmp = arr[j];
//				for (int i = j; i < length - 1; i++) {
//					arr[i] = arr[i + 1];
//				}
//				arr[length - 1] = tmp;
//			}
//		}
//		answer = new int[length - 1];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = arr[i];
//		}
//		return answer;
//	}
//	
//	public void catchCondition(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.exit(1);
//				}
//			}
//		}
//	}
//}

//import java.util.Arrays;
//
//class Solution {
//	public int[] solution(int[] arr) {
//		int[] answer = {};
//		if (arr.length < 2) {
//			answer = new int[1];
//			answer[0] = -1;
//			return answer;
//		}
//		
//		for (int i = 1; i < answer.length; i++) {
//			if (arr[i-1] == arr[i]) {
//				answer = new int[1];
//				answer[0] = -1;
//				return answer;
//			}
//		} 
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		int startIndex = findMinNumIndex(arr);
//		answer = new int[startIndex];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = arr[i];
//			System.out.println(answer[i]);
//		}
//
//		return answer;
//	}
//
//	public int findMinNumIndex (int[] arr){
//		
//		
//		String minNum = Integer.toString(arr[arr.length-1]);
//		String[] numStrArr = new String[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			numStrArr[i] =Integer.toString(arr[i]);
//		}
//		String numStr = String.join("", numStrArr);
//		int startIndex = numStr.indexOf(minNum);
//	
//		return startIndex;
//	}
//
//	public static void main(String[] args) {
//		int[] arr = { 3, 2, 1, 4, 5, 6, 7, 2, 3, 5, 5, 1 };
//		Solution sol = new Solution();
//		sol.solution(arr);
//	}
//}
