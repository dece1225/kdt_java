package homework;

import java.util.Scanner;

public class SingTask02 {

	public static void main(String[] args) {
		
		//1)입력 클래스 import
		Scanner sc = new Scanner(System.in);
		//2)변수 선언(금액 int)
		int coin = 0;
		//3)상수 선언(곡 당 금액 int 200, 음료 금액 int 100)
		final int SING_PAY = 200;
		final int DRINK_PAY = 100;
		//4)입력 메시지 출력
		System.out.print("금액입력 : ");
		//5)변수에 입력메소드 사용
		coin = sc.nextInt();
		//6)결과 출력
		//6-1)노래만 부르는 경우 결과 출력
		System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.\n",coin/SING_PAY, coin % SING_PAY);
		//6-2)음료를 하나 구매 가능 시 결과 출력
		System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 100원입니다."
				,(coin-DRINK_PAY)/SING_PAY, (coin-DRINK_PAY) % SING_PAY);
		sc.close();
	}

}
