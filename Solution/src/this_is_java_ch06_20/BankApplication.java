package this_is_java_ch06_20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.�۱� | 5.����");
			System.out.println("---------------------------------------");
			System.out.println("����>");

			int selectNo = scanner.nextInt();
			// ���»���
			if (selectNo == 1) {
				createAccount();
			}
			// ���¸�� ����
			if (selectNo == 2) {
				accountList();
			}
			// �����ϱ�
			if (selectNo == 3) {
				deposit();
			}
			// �۱��ϱ�
			if (selectNo == 4) {
				withdraw();
			}
			// �����ϱ�
			if (selectNo == 5) {
				run = false;
			}
		}
	}

	// ���»��� method
	private static void createAccount() {

	}

	// ���¸�� ���� method
	private static void accountList() {

	}

	// �����ϱ� method
	private static void deposit() {

	
	}
	// �۱��ϱ� method
	private static void withdraw() {

	}
	//Account �迭���� ano�� ������ Account ��ü ã�� (deposit() �� withdraw() �̿�)
	private static Account findAccount(String ano) {
		
	}

}
