package homework07;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		// 1번
//		int num = 0;
//		System.out.print("한개의 정수를 입력하시오: ");
//		num = sc.nextInt();
//		String result = num % 2 == 0 ? "짝수" : "홀수";
//		System.out.println(result);
//
//		// 2번
//		if (num < 0) {
//			System.out.println("음수");
//		} else if (num > 0) {
//			System.out.println("양수");
//		} else {
//			System.out.println("0");
//		}


//		// 3번
//		int age = 0;
//		System.out.print("나이를 입력: ");
//		age = sc.nextInt();
//		if (age >= 0 && age <= 12) {
//			System.out.println("어린이 입니다.");
//		} else if (age >= 13 && age <= 19) {
//			System.out.println("청소년 입니다.");
//		} else if (age >= 20) {
//			System.out.println("성인 입니다.");
//		} else {
//			System.out.println("잘못된 값입니다.");
//		}

//		// 4번
//		int num1 = 0, num2 = 0, num3 = 0;
//		System.out.print("세 개의 정수 입력: ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//
//		if (num1 > num2 && num1 > num3) {
//			if (num2 > num3) {
//				System.out.println(num1 + " " + num2 + " " + num3);
//			} else {
//				System.out.println(num1 + " " + num3 + " " + num2);
//			}
//		} else if (num2 > num1 && num2 > num3) {
//			if (num1 > num3) {
//				System.out.println(num2 + " " + num1 + " " + num3);
//			} else {
//				System.out.println(num2 + " " + num3 + " " + num2);
//			}
//		} else {
//			if (num1 > num2) {
//				System.out.println(num3 + " " + num1 + " " + num2);
//			} else {
//				System.out.println(num3 + " " + num2 + " " + num1);
//			}
//		}

		//5번
		String input = "";
		System.out.println("문자를 자유롭게 입력하시오('X'입력시 종료)");
		while(true) {
			input = sc.nextLine();
			if (input.equals("X")) {
				System.out.println("종료 완료");
				break;
			}
		}
		
		sc.close();
	}

}
