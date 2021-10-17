package src;

//Lv1_가운데 글자 가져오기
//왜 subStirng 이용하면 틀리게 나오지?
class getMiddleCharacter {
	public String solution(String s) {
        String answer = "";
        int length = s.length();
        if (length % 2 == 0) {
        	String[] tmp = s.split("");
			answer = tmp[length/2 -1] + tmp[length/2];
		}	
        else if (length % 2 == 1) {
			String[] tmp = s.split("");
			answer = tmp[(length-1)/2];
		}
        
        return answer;
    }
	public static void main(String[] args) {
		String s ="abdcde";
		getMiddleCharacter sol = new getMiddleCharacter();
		System.out.println(s.length());
		System.out.println(sol.solution(s));
	}
}