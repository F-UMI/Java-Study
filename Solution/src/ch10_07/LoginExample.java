package ch10_07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white" , "12345");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		try {
			login("blue" , "54321");
		} catch (Exception e) {
		System.out.println(e.getMessage());

		}
		
		
	}

	private static void login(String id, String password) throws NotExistIDException , WrongPasswordException {
		//아이디가 일치하지 않을경우 NotExistIDException 예외 호출
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		//패스워드가 일치하지 않을경우 WrongPasswordException 예외 호출
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀렸습니다.");
		}
		
	}
}
