package homework;

import java.util.Scanner;

public class SingTask01 {

	public static void main(String[] args) {
		//1)입력 클래스 import
		Scanner sc = new Scanner(System.in);
		//2)변수 선언(금액 int, 곡당 가격 int)
		int coin = 0, singPay = 0;
		//3)입력 메시지 출력1
		System.out.print("금액입력 : ");
		//4)변수에 입력 메소드 사용1
		coin = sc.nextInt();
		//5)입력 메시지 출력2
		System.out.print("곡 당 가격입력 : ");
		//6)변수에 입력 메소드 사용2
		singPay = sc.nextInt();
		//7)결과 출력 => 잔돈이 부족할 경우 안내하기
		//7-1)if문 추가(coin < singPay인 경우 안내하기)
		if(coin < singPay) {
			//7-2)결과 출력(안내하는 경우)
			System.out.printf("입력한 금액은 %d원입니다. "
					+ "곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다.",coin,singPay,singPay-coin);
		}else {//7-3)결과 출력(부를 수 있는 경우)
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다", coin/singPay, coin % singPay);			
		}
		
		sc.close();
	}

}
