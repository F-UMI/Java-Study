//효율성 실패

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Athletes_Who_Did_Not_Complete {

  public String solution(String[] participant, String[] completion) throws Exception {

    Map<String, Integer> participantMap = new HashMap<>();
    putParticipant(participant, participantMap);
    putCompletion(completion, participantMap);
    return verifyParticipant(participantMap);

  }
/*        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));
        Stream<String> participantStream = Arrays.stream(participant);
        participantStream.filter(completionList::contains).peek(participantList::remove).forEach(completionList::remove);
        return participantList.get(0);*/

  private static void putParticipant(String[] participant, Map<String, Integer> participantMap) {

    for (String player : participant) {
      participantMap.put(player, participantMap.getOrDefault(player, 0) + 1);
    }
  }

  private static void putCompletion(String[] completion, Map<String, Integer> participantMap) {
    for (String player : completion) {
      participantMap.put(player, participantMap.get(player) - 1);
    }
  }

  private static String verifyParticipant(Map<String, Integer> participantMap) throws Exception {
    for (Entry<String, Integer> participantEntry : participantMap.entrySet()) {
      if (participantEntry.getValue() != 0) {
        return participantEntry.getKey();
      }
    }
    throw new RuntimeException();
  }

}
