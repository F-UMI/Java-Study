package this_is_java_ch06_20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("  1.계좌생성 | 2.계좌목록 | 3.예금 | 4.송금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
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
		
		int accountNum = 0;
		System.out.println("------------");
		System.out.println("  계좌 생성      ");
		System.out.println("------------");
		
		System.out.print("계좌번호:");
		String selectAno = scanner.nextLine();
		accountArray[accountNum].setAno(selectAno);
		System.out.print("계좌주:");
		String selectOwner = scanner.nextLine();
		accountArray[accountNum].setOwner(selectOwner);
		System.out.print("초기입금액:");
		int selectBalance = scanner.nextInt();
		accountArray[accountNum].setBalance(selectBalance);
		System.out.println("결과: 계좌가 생성되었습니다.");

	}

	// 계좌목록 보기 method
	private static void accountList() {
		System.out.println("------------");
		System.out.println("  계좌 생성      ");
		System.out.println("------------");
		for (int i = 0; i < accountArray.length; i++) {
			System.out.println(accountArray[i].getAno()  + "      "+ accountArray[i].getOwner()  + "       " +accountArray[i].getBalance());
		}
	}

	// 예금하기 method
	private static void deposit() {
		System.out.println("------------");
		System.out.println("     예금        ");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String selectAno = scanner.nextLine();
		System.out.print("예금액: ");
		int putBalance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() == selectAno) {
				accountArray[i].setBalance(accountArray[i].getBalance() + putBalance);
			}
		}
	}

	// 송금하기 method
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("      출금      ");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String selectAno = scanner.nextLine();
		System.out.print("출금액: ");
		int putBalance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() == selectAno) {
				accountArray[i].setBalance(accountArray[i].getBalance() - putBalance);
			}
		}
	}

//	// Account 배열에서 ano와 동일한 Account 객체 찾기 (deposit() 과 withdraw() 이용)
//	private static Account findAccount(String ano) {
//
//	}

}
