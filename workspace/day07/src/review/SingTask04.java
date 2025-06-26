package review;

import java.util.Scanner;

public class SingTask04 {

	public static void main(String[] args) {

		// 1)입력클래스 import
		Scanner sc = new Scanner(System.in);
		// 2)정수형 상수 2개 선언, 정수형 6개 선언(금액입력, 노래곡수, 잔돈, 음료마실경우노래곡수, 음료마실경우잔돈, 보너스곡)
		final int PRICE = 200, PRICE_DRINK = 100;
		int money = 0, song = 0, change = 0, drinkSong = 0, drinkChange = 0, bonus = 0;

		// 3)입력메시지 출력
		System.out.println("금액 입력 : ");
		// 4)변수1 = 금액 입력 nextInt()
		money = sc.nextInt();
		// 5)변수2 = 변수1 / 상수1
		song = money / PRICE;
		drinkSong = song - 1;
		// 6)변수3 = 변수1 / 상수1
		change = money % PRICE;
		// 7)출력(몇곡 부를수 있으며 잔돈은 얼마입니다)
		System.out.printf("%d곡을 부를 수 있고 잔돈은 %d원 입니다.\n", song, change);

		// +) if 음료금액보다 잔액이 크거나 같을 경우
		if (change >= PRICE_DRINK) {
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를수있으며 잔돈은 %d원 입니다.\n", song, change - PRICE_DRINK);
		}

		// 8)음료를 위해 한 곡을 줄이는 경우
		// if(노래곡수 > 0) && (금액 - ((노래곡수) - 1) * 노래가격)) >= 음료금액){
		else if (song > 0 && (money - ((song - 1) * PRICE)) >= PRICE_DRINK) {
			// 9) 음료마실경우 노래곡수 = 노래곡수 - 1
//			drinkSong = song - 1;
			// 10) 음료마실경우 잔돈 = 금액 -(음료마실경우노래곡수 * 노래가격 + 음료금액)
			drinkChange = money - (drinkSong * PRICE + PRICE_DRINK);
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를수 있으며 잔돈은 %d원입니다\n", drinkSong, drinkChange);
		}
		// 11)보너스 곡 제공
		// 보너스곡 = 노래곡수 /5;
		// 12) if(보너스곡 > 0){
		// 보너스로 몇곡이 추가되어 총 몇곡을 부를 수 있습니다.
		// }
		bonus = song / 5;
		if (bonus > 0) {
			System.out.printf("보너스로 %d곡이 추가되어 총 %d곡을 부를 수 있습니다.\n", bonus, song + bonus);
		}

		// +) sc.close()
		sc.close();

	}

}
