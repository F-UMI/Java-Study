//효율성 실패
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Athletes_Who_Did_Not_Complete {
    public String solution(String[] participant, String[] completion) {

        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));
        Stream<String> participantStream = Arrays.stream(participant);
        participantStream.filter(completionList::contains).peek(participantList::remove).forEach(completionList::remove);
        return participantList.get(0);
    }


}
