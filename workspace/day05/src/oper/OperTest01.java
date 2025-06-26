package oper;

//13번 : 산술연산자(+, -, *, /, %)
public class OperTest01 { //클래스 중괄호 영역 시작

	public static void main(String[] args) { // main 메소드 중괄호 영역 시작
		int num1 = 10, num2 = 20; // int형 변수 num1에 10값을 대입, int형 변수 num2에 20값을 대입
		double num3 = 5.5, num4 = 2.5; // double형 변수 num3에 5.5값을 대입, double형 변수 num4에 2.5값을 대입

		System.out.println("=======덧셈======="); // 괄호안 내용을 출력
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); //"10 + 20 = 30" 출력
		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4)); //"5.5 + 2.5 = 8.0" 출력
		System.out.println(num1 + " + " + num4 + " = " + (num1 + num4)); //"10 + 2.5 = 12.5" 출력
		
		System.out.println("\n=======뺄셈=======");
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); //"10 - 20 = -10" 출력
		System.out.println(num3 + " - " + num4 + " = " + (num3 - num4)); //"5.5 - 2.5 = 3.0" 출력
		System.out.println(num1 + " - " + num4 + " = " + (num1 - num4)); //"10 - 2.5 = 7.5" 출력
		
		System.out.println("\n=======곱셈=======");
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); //"10 * 20 = 200" 출력
		System.out.println(num3 + " * " + num4 + " = " + (num3 * num4)); //"5.5 * 2.5 = 13.75" 출력
		System.out.println(num1 + " * " + num4 + " = " + (num1 * num4)); //"10 * 2.5 = 25.0" 출력
		
		System.out.println("\n=======나눗셈=======");
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); //"10 / 20 = 0" 출력
		System.out.println(num3 + " / " + num4 + " = " + (num3 / num4)); //"5.5 / 2.5 = 2.2" 출력
		System.out.println(num1 + " / " + num4 + " = " + (num1 / num4)); //"10 / 2.5 = 4.0" 출력
		
		System.out.println("\n=======나머지=======");
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); //"10 % 20 = 10" 출력
		System.out.println(num3 + " % " + num4 + " = " + (num3 % num4)); //"5.5 % 2.5 = 0.5" 출력
		System.out.println(num1 + " % " + num4 + " = " + (num1 % num4)); //"10 % 2.5 = 0.0" 출력

		//복합대입연산자
		int num = 10; // int형 변수 num에 10값을 대입
		System.out.println("num의 현재 값 : " + num); // "num의 현재 값 : <num값>" 출력
		num = num + 5; // int형 변수 num에 num+5값을 대입
		System.out.println("num의 현재 값 : " + num); // "num의 현재 값 : <num값>" 출력
		num = num + 15; // int형 변수 num에 num+15값을 대입
		System.out.println("num의 현재 값 : " + num); // "num의 현재 값 : <num값>" 출력
		num += 5; // num = num + 5
		System.out.println("num의 현재 값 : " + num); // "num의 현재 값 : <num값>" 출력
		num -= 2.5; // num = num - 2.5 //num이 int형 변수이므로 형변환이 이루어져 손실이 발생 -> 32.5가 32로 출력
		System.out.println("num의 현재 값 : " + num); // "num의 현재 값 : <num값>" 출력
		System.out.println(35-2.5); //정수 - 실수 = 실수
		num *= 2; // num = num * 2
		System.out.println("num의 현재 값 : " + num); // "num의 현재 값 : <num값>" 출력
		

	}// main 메소드 중괄호 영역 끝

}// 클래스 중괄호 영역 끝
