package oper;

import java.util.Scanner;

//6번 : 삼항연산자 실습
public class OperTask02 {

	public static void main(String[] args) {
		
		//1. 두 수를 입력받아 비교
		//크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직 구성
		
		//1)입력 클래스 import
		Scanner sc = new Scanner(System.in);
		//2)입력 메시지 출력
		System.out.println("비교할 두 수 입력");// 내용 출력
		//3)변수 선언, 입력메소드 사용
		int num1 = sc.nextInt(), num2 = sc.nextInt();// int 변수 num1와 num2에 정수형 입력메소드 대입
		//4)삼항연산자 사용하여 출력 => 크다/작다/같다가 출력되어야함
		String result1 = num1 > num2 ? "num1이 num2보다 크다" : "num1이 num2보다 작다";
		//num1이 num2보다 크다라는 조건식이 참이면 "num1이 num2보다 크다", 거짓이면 "num1이 num2보다 작다" 인 값을
		//문자열 변수 result1에 대입
		String result2 = num1 == num2 ? "num1과 num2는 같다" : result1 ;
		//num1이 num2와 같다라는 조건식이 참이면 "num1과 num2는 같다", 거짓이면 result1값 인 값을 
		//문자열 변수 result2에 대입
		System.out.println(result2);// result2 값 출력
		
		//2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기
		//짝수입니다 or 짝수가 아닙니다로 출력할 것
		//1)입력클래스 import
		//2)입력 메시지 출력
		System.out.println("정수를 하나 입력");//괄호안 내용 출력
		//3)변수 선언, 입력메소드 사용
		int numInt = sc.nextInt();// int형 변수 numInt에 정수입력메소드 대입
		//4)결과 출력
		String resultOdd = numInt % 2 == 0 ? "짝수입니다" : "짝수가 아닙니다";
		//numInt를 2로 나눈 나머지가 0과 같다라는 조건식이 참이면 "짝수입니다", 거짓이면 "짝수가 아닙니다" 인 값을
		//문자열 변수 resultOdd에 대입
		System.out.println("입력한 숫자 " + numInt + "는 " +  resultOdd); // 내용 출력
		
		sc.close();
	}

}
