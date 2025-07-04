package ex02_KTH;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account(10000);
		int money = 0;
		int disMoney = 0;
		System.out.println("출금할 금액을 입력하세요");
		money = sc.nextInt();

		try {
			ac.withdraw(money);
		} catch (NumberFormatException e) {
			System.out.printf("현재 잔고는 %d원입니다. 출금금액의 %d원이 부족하여 출금이 불가합니다\n", ac.balance, money - ac.balance);
		}
		
		System.out.println("입금할 금액을 입력하세요");
		disMoney = sc.nextInt();
		ac.deposit(disMoney);
	}
}
