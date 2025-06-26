package ifTest;

import java.util.Scanner;

//11번 : if ~ else문 실습 1
public class IfTask01 {//클래스 시작 영역

	public static void main(String[] args) {//main 시작 영역

		// 사용자로 부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		// 로직구성
		// 1)입력클래스 import
		Scanner sc = new Scanner(System.in);
		// 2)변수 선언
		int number = 0; // int 변수 number에 0값으로 초기화
		// 자료형들의 기본값
		// 정수 0, 실수 0.0, 문자형 ' ', 문자열 "" or null, 논리형 false

		// 3)입력 메시지 출력
		System.out.println("숫자를 입력하시오");// 괄호안 내용 출력
		// 4)변수에 입력메소드 사용
		number = sc.nextInt();// number변수에 정수입력값 대입
		// 5)if문 선언 (조건식->변수 % 2 == 0)
		if (number % 2 == 0) {// if문 시작 / number를 2로 나눈 나머지가 0이면
			// 6)짝수 출력
			System.out.println("짝수입니다"); // 괄호안 내용 출력
		}//if문 끝
		// 7)else문 선언
		else {//else문 시작 / if 조건식이 false이면
			// 8)홀수 출력
			System.out.println("홀수입니다"); // 괄호안 내용 출력
		}//else문 끝
		sc.close(); // 입력 클래스 닫기

		// 삼항연산자
		System.out.println((number % 2 != 1) ? "짝수입니다" : "홀수입니다"); // 조건식이 참이면 짝수입니다
																	//거짓이면 홀수입니다 출력

	}

}
