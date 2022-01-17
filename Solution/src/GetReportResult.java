import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class GetReportResult {

    private static final String REGEX = " ";
    private static final int ZERO = 0;
    private static final int EVEN = 2;


    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        List<String> duplicateIDList = getSplitList(toDeduplication(report));
/*        duplicateIDList.forEach(System.out::println);*/
        int[][] ReportResultArray = new int[id_list.length][id_list.length];
        IntStream.range(ZERO, duplicateIDList.size())
                .filter(this::isEven)
                .forEach(index -> recordReport(index, duplicateIDList, id_list, ReportResultArray));
        return discriminationReportCount(ReportResultArray, answer, k);
        // 누적수가 k 이상일때 해당 열값이 1인 인덱스의 개수를 리턴하면 된다.

    }

    private int[] discriminationReportCount(int[][] reportResultArray, int[] answer, int k) {
        int[] reportedCount = new int[answer.length];
        for (int i = 0; i < reportResultArray.length; i++) {
            for (int j = 0; j < reportResultArray.length; j++) {
                reportedCount[i] += reportResultArray[j][i];
            }
        }

        for (int i = 0; i < reportedCount.length; i++) {
            if (reportedCount[i] >= k) {
                for (int j = 0; j < reportResultArray.length; j++) {
                    if (reportResultArray[j][i] != 0) {
                        answer[j]++;
                    }
                }
            }
        }

        return answer;
    }

    private void recordReport(int index, List<String> duplicateIDList, String[] id_list,
                              int[][] ReportResultArray) {
        List<String> id_toList = Arrays.stream(id_list).collect(Collectors.toList());
        int row = id_toList.lastIndexOf(duplicateIDList.get(index));
        int column = id_toList.lastIndexOf(duplicateIDList.get(index + 1));
        ReportResultArray[row][column]++;
/*        System.out.println(row + " " + +column + " " + ReportResultArray[row][column]);*/
    }

    private boolean isEven(int index) {
        return index % EVEN == ZERO;
    }

    private static String[] toDeduplication(String[] report) {
        return Arrays.stream(report)
                .distinct()
                .toArray(String[]::new);
    }

    private static List<String> getSplitList(String[] report) {
        return Arrays.stream(report).map(id -> id.split(REGEX))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }


}
