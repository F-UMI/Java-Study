package chap06.ch06_20;

import java.util.Scanner;



// 막혔던 이유: 메소드 구성후에 각각에 해당하는 객체를 어떠한 방법으로 호출할지, 이를 저장할지 기억이 나지 않았다.
// 			 또한 배열을 크기지정 해서 저장시 해당값이 NULL인것을 까먹은것이 문제 해결을 어렵게 하였다.



public class BankApplication {
	private static Account[] accountArray = new Account[100]; // 배열 생성시 크기만 지정할경우 각 배열에 해당하는 값은 NULL로 저장이 된다 (V
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("  1.계좌생성 | 2.계좌목록 | 3.예금 | 4.송금 | 5.종료");
			System.out.println("----------------------------------------------------------");
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
		System.out.println("------------");
		System.out.println("  계좌 생성      ");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String selectAno = scanner.next();
		System.out.print("계좌주:");
		String selectOwner = scanner.next();
		System.out.print("초기입금액:");
		int selectBalance = scanner.nextInt();

		Account newAccount = new Account(selectAno, selectOwner, selectBalance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // 배열이 비어있는곳(null) 이 있을경우
				accountArray[i] = newAccount; // 해당하는 곳에 객체를 새로 저장 시킨다.
				System.out.println("계좌가 생성되었습니다.");
				break;
			}

		}

//		System.out.print("계좌번호:");
//		String selectAno = scanner.nextLine();
//		account.setAno(selectAno);
//		accountArray[accountNum].setAno(selectAno);
//		System.out.print("계좌주:");
//		String selectOwner = scanner.nextLine();
//		account.setOwner(selectOwner);
//		accountArray[accountNum].setOwner(selectOwner);
//		System.out.print("초기입금액:");
//		int selectBalance = scanner.nextInt();
//		accountArray[accountNum].setBalance(selectBalance);
//		account.setBalance(selectBalance);
//		System.out.println("결과: 계좌가 생성되었습니다.");
//		accountNum++;

	}

	// 계좌목록 보기 method
	private static void accountList() {
		System.out.println("------------");
		System.out.println("  계좌 목록      ");
		System.out.println("------------");
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.print(accountArray[i].getAno() + "       " + accountArray[i].getOwner() + "       "
						+ accountArray[i].getBalance());
				System.out.println("");
			}

		}

//		for (int i = 0; i < 100; i++) {
//			System.out.println(accountArray[i].getAno()  + "      "+accountArray[i].getOwner()  + "       " +accountArray[i].getBalance());
//		}
	}

	// 예금하기 method
	private static void deposit() {
		System.out.println("------------");
		System.out.println("     예금        ");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String selectAno = scanner.next();
		System.out.print("예금액: ");
		int putBalance = scanner.nextInt();
		Account account = findAccount(selectAno);
		account.setBalance( account.getBalance() + putBalance );
	}

//		Account account = new Account("", "", 0);
//		for (int i = 0; i < 100; i++) {
//			if (accountArray[i].getAno() == selectAno) {
//				accountArray[i].setBalance(accountArray[i].getBalance() + putBalance);
//			}
//		}

	// 송금하기 method
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("      출금      ");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String selectAno = scanner.next();
		System.out.print("출금액: ");
		int putBalance = scanner.nextInt();
		Account account = findAccount(selectAno);
		account.setBalance( account.getBalance() - putBalance );
	}

//		Account account = new Account("", "", 0);
//		for (int i = 0; i < 100; i++) {
//			if (accountArray[i].getAno() == selectAno) {
//				accountArray[i].setBalance(accountArray[i].getBalance() - putBalance);
//			}
//		}

//	// Account 배열에서 ano와 동일한 Account 객체 찾기 (deposit() 과 withdraw()"에서" 이용 할 것임.)
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();  //해당 변수에 i번째 Ano 를 저장시킴
				if (dbAno.equals(ano)) {				  //dbAno와 ano 동일 여부 확인 (문자열이 같으면 되기에 equal method 이용한다.)
					account = accountArray[i];			  //동일 할 경우 return 할 변수에 현재 i번째 객체를 대입시켜준다.
				}
			}
		}
		return account;
	}

}
