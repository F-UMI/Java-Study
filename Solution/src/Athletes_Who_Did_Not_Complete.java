import java.util.HashMap;
import java.util.Map;

public class Athletes_Who_Did_Not_Complete {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Void> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++){
            map.put(participant[i],null);
        }


        return answer;
    }
}
