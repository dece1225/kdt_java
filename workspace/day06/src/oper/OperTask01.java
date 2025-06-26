package oper;

import java.util.Scanner;

//4번 : ~논리연산자까지 복습문제
public class OperTask01 {

	public static void main(String[] args) {
		// 사용자가 입력한 2개의 값를 서로 비교하기(관계연산자 3개 확인)
		// nextInt() 사용, 변수를 먼저 만들고 진행할 것
		// 변수 만들 때 의미있는 문자로 사용

		// 로직구성
		// 1)입력 클래스 선언 및 import
		Scanner sc = new Scanner(System.in);
		// 2)정수형 변수 2개 선언
		int number1, number2;
		// 3)입력 메시지 출력
//		System.out.print("비교할 수 두개를 입력하시오: ");
		// 4)변수에 입력 메소드 대입
//		number1 = sc.nextInt();
//		number2 = sc.nextInt();
		// 5)결과 출력
//		System.out.println(number1 + " < " + number2 + " : " + (number1 < number2));
//		System.out.println(number1 + " == " + number2 + " : " + (number1 == number2));
//		System.out.println(number1 + " >= " + number2 + " && " + number1 + "!=" + number2 + " : "
//				+ (number1 >= number2 || number1 != number2));

		// 실수 관계연산자 사용
		double num3, num4;
		System.out.println("실수 2개를 입력하시오");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + " < " + num4 + " : " + (num3 < num4));
		//0.00000001 0.00000000001
		//1.0E-8 < 1.0E-11 : false
		//1.0E-8 10의 -8제곱(소수점아래 8자리)
		//1.0E-11 10의 -11제곱(소수점아래 11자리)
		
		// +)입력클래스 해제
		sc.close();
	}

}
