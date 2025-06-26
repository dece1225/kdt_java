package oper;

//14번 : 증감연산자
public class OperTest02 { // 클래스 중괄호 영역 시작

	public static void main(String[] args) { // main 메소드 중괄호 영역 시작

		int num = 1; // int형 변수 num에 1값을 대입
		System.out.println("num의 값 : " + num); // "num의 값 : <num값>" 출력
		System.out.println("num + 10의 값 : " + (num + 10)); // "num + 10의 값 : <num+10값> 출력"
		
		System.out.println("\n=========증감연산자(전위형)========="); // 괄호안 내용 출력
		System.out.println("기존 num의 값 : " + num); // "기존 num의 값 : <num값(1)>"
		System.out.println("전위증감연산자를 사용한 num의 값 : "+ ++num ); // 2
							//전위증감연산자를 사용한 num의 값 : <num값(2)> 출력
		System.out.println("현재 num의 값 : "+ num ); // 2
							// 현재 num의 값 : <num값(2)>
		
		System.out.println("\n=========증감연산자(후위형)=========");
		int num2 = 1; // int형 변수 num2에 1값을 대입
		System.out.println("기존 num2의 값 : " + num2); // 1
							// 기존 num2의 값 : <num2값(1)> 출력
		System.out.println("후위증감연산자를 사용한 num의 값 : "+ num2++); // 1
							// 후위증감연산자를 사용한 num의 값 : <num2값(1)> 출력
		System.out.println("현재 num의 값 : "+ num2 ); // 2
							// 현재 num의 값 : <num2값(2)> 출력
		
		System.out.println();
		int num3 = 7, num4 = 7; // int형 변수 num3에 7값, int형 변수 num4에 7값을 대입
		int result1 = 0, result2 = 0; // int형 변수 result1에 0값 , int형 변수 result2에 0값을 대입
		
		result1 = --num3 + 4; // result1에 전위증감된 num3값에 4를 더한 값을 대입
		System.out.println(result1); // result1값(6+4=>10) 출력
//		result2 = num4++;
		result2 = num4++ - 4; // result2에 후위증감된 num4값에 4를 뺀 값을 대입
		System.out.println(result2); // result2값(7-4=>3) 출력 / num4 = 8
		System.out.println(num4); // num4(8)값 출력
		
	} // main 메소드 중괄호 영역 끝

}// 클래스 메소드 중괄호 영역 끝
