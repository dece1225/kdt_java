package homework07;

import java.util.Scanner;

public class AtmTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		final int NOW_MONEY = 10000;
		String msg ="\nATM 기기의 메뉴 중 번호를 선택하세요."
			      + "\n1. 잔액조회"
			      + "\n2. 입금"
			      + "\n3. 출금"
			      + "\n4. 종료"
			      + "\n선택 : ";
		int button = 0;

		System.out.println(msg);
		while(flag) {
			button = sc.nextInt();
			switch(button) {
			case 1:
				System.out.printf("현재 잔액은 %d입니다",NOW_MONEY);
				break;
			case 2:
				System.out.println("입금 메뉴입니다");
				break;
			case 3:
				System.out.println("출금 메뉴입니다");
				break;
			case 4:
				System.out.println("종료되었습니다");
				flag = false;
				break;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			}
			
		}

	}

}
