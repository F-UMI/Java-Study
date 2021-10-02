import java.util.regex.Pattern;
//다시
class suggestionNewID {
    public String solution(String new_id) {
    	String answer = "";
    	String[] verifyId = new_id.split("");
    	//1단계
    	for (int i = 0; i < new_id.length(); i++) {
			if (Character.isUpperCase(new_id.charAt(i)) == true) {
				verifyId[i].toLowerCase();
			}
		}
    	//2단계
    	for (int i = 0; i < verifyId.length; i++) {
    		String conditionString = "^[a-z.-_]*$";
    		if (Pattern.matches(conditionString, verifyId[i]) == false) {
				
			}
		}
    	
        return answer;
    }
    
    
    
    
    
    
    public void setIdCondition (String new_id) {
    	if (new_id.length() < 3 || new_id.length() > 15) {
			System.out.println("아이디의 길이는 3자이상 15자 이하여야 합니다.");
			System.exit(1);
    	}
    	String lowerCase = "^[a-z.-_]*$";
    	if (Pattern.matches(lowerCase, new_id) == false) {
			System.out.println("조건에 맞지 않은 아이디 입니다.");
			System.exit(1);
		}
    	else {
			if () {
				
			}
		}
    	
		}
    }