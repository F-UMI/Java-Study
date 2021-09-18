package this_is_java_ch06_20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.송금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택>");

			int selectNo = scanner.nextInt();
			// 계좌생성
			if (selectNo == 1) {
				createAccount();
			}
			// 계좌목록 보기
			if (selectNo == 2) {
				accountList();
			}
			// 예금하기
			if (selectNo == 3) {
				deposit();
			}
			// 송금하기
			if (selectNo == 4) {
				withdraw();
			}
			// 종료하기
			if (selectNo == 5) {
				run = false;
			}
		}
	}

	// 계좌생성 method
	private static void createAccount() {

	}

	// 계좌목록 보기 method
	private static void accountList() {

	}

	// 예금하기 method
	private static void deposit() {

	
	}
	// 송금하기 method
	private static void withdraw() {

	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기 (deposit() 과 withdraw() 이용)
	private static Account findAccount(String ano) {
		
	}

}
