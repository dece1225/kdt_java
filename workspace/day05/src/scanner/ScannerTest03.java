package scanner;

import java.util.Scanner; // 입력 클래스 import

//7번 : 입력클래스, 입력메소드 연습1(주소입력)
public class ScannerTest03 { //클래스 중괄호 영역 시작

	public static void main(String[] args) { // main 메소드 중괄호 영역 시작
		//1. 사용자로부터 입력받아 주소를 출력하기
		//1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in); // 입력 메소드 사용을 위해 입력 클래스 선언
		//2) 입력 클래스 import
		//ctrl + shift + o
				
		//3) 문자열 변수 선언
		String address; // 문자열 변수 address를 선언
		
		//+) 출력 메시지
		System.out.println("주소를 입력하세요."); // 괄호안 내용 출력
		
		//4) 입력메소드 사용
		address = sc.nextLine(); // 문자열 변수 address 에 한줄 입력값을 대입
		
		//5) 결과 출력
		System.out.println("주소는 " + address + "입니다.");//주소는 <address값>입니다. 를 출력
		System.out.printf("주소는 %s입니다.", address); // 주소는 <address값>입니다. 를 출력
		
		//6) 입력 클래스 해제
		sc.close(); // 입력 클래스 메모리 해제
		
	} // main 메소드 중괄호 영역 끝

}// 클래스 중괄호 영역 끝
