class Solution {

  private final static int ZERO = 0;
  private final static int ONE = 1;
  private final static int TWO = 2;

  public int[] solution(int N, int[] stages) {
    int[][] failureRateArray = new int[N + 1][TWO];
    enterResult(failureRateArray, stages);
    double[] percentage = new double[N];
    calculateRate(failureRateArray, percentage);
    /*for (int[] ints : failureRateArray) {
      System.out.println(ints[0] + "/" + ints[1]);
    }*/
    return stages;
  }

  private void enterResult(int[][] failureRateArray, int[] stages) {
    for (int stage : stages) {
      if (stage == ZERO) {
        failureRateArray[ZERO][ZERO]++;
      }
      for (int j = 0; j < stage - 1; j++) {
        failureRateArray[j + 1][ZERO]++;
        failureRateArray[j][ONE]++;
      }
    }
    failureRateArray[ZERO][ZERO] += failureRateArray[ZERO][ONE];
  }

  private void calculateRate(int[][] failureRateArray, double[] percentage) {
    for (int i = 0; i < percentage.length; i++) {
      percentage[i] =
          (double) (failureRateArray[i][ZERO] - failureRateArray[i][ONE]) / failureRateArray[i][0];
      /*System.out.println(failureRate[i]);*/
    }

  }

}


  /* int[] answer = new int[N+1];
        int[][] stageProgress = new int[N+1][2];
        double[] failureRate = new double[N+1];
        for (int stage : stages){
            for (int j = 0; j < stage; j++){
                stageProgress[j][0] += 1;
                stageProgress[j][1] += 1;
                if(j == stage - 1) {
                    stageProgress[j][1] -= 1;
                }
            }
        }
        for (int i = 0; i < stageProgress.length; i++){
            try {
                failureRate[i] = (double) stageProgress[i][1] / stageProgress[i][0];
            } catch(Exception e) {
                failureRate[i] = 1;
            }
        }
        double[] tmp = new double[N+1];
        System.arraycopy(failureRate, 0, tmp, 0, failureRate.length);
        Arrays.sort(tmp);

        for (int i = 0; i < tmp.length; i++){
            for (int j = 0; j < failureRate.length; j++){
                if(tmp[i] == failureRate[j]) {
                    answer[i] = j+1;
                }
            }
        }

        return answer;*/
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] array = {2,1,2,6,2,4,3,3};
//        solution.solution(5,array);
//    }
