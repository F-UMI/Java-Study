package chap06.ch06_15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인이 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id || password 가 올바르지 않습니다.");
		}
	}
}
