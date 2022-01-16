import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class GetReportResult {

  private static final String REGEX = " ";
  private static final int ZERO = 0;
  private static final int EVEN = 2;


  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {};
    List<String> duplicateIDList = getSplitList(toDeduplication(id_list));
    String[][] ReportResultArray = new String[id_list.length][id_list.length];
    IntStream.rangeClosed(ZERO, duplicateIDList.size())
        .filter(this::isEven)
        .forEach(index -> recordReport(index, duplicateIDList, id_list, ReportResultArray));

    return answer;


  }

  private void recordReport(int index, List<String> duplicateIDList, String[] id_list, String[][] ReportResultArray) {
  }

  private boolean isEven(int index) {
    return index % EVEN == ZERO;
  }

  private static String[] toDeduplication(String[] id_list) {
    return Arrays.stream(id_list).distinct().toArray(String[]::new);
  }

  private static List<String> getSplitList(String[] id_list) {
    return Arrays.stream(id_list).map(id -> id.split(REGEX)).flatMap(Arrays::stream)
        .collect(Collectors.toList());
  }


}
