package scanner;

import java.util.Scanner; // 입력 클래스 import

//10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTask02 {// 클래스 중괄호 영역 시작

	public static void main(String[] args) {// main 메소드 중괄호 영역 시작
		
		//1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번, 출력은 1번만 사용해서 출력)
		//입력1 : 자바는
		//입력2 : 객체지향
		//입력3 : 언어입니다
		//출력
		// 자바는
		// 객체지향
		// 언어입니다
		
//		//1) 입력 클래스 선언 및 import
//		Scanner sc = new Scanner(System.in); // 입력 메소드 사용을 위해 입력 클래스를 선언한다.
//		//2) 입력 메시지 출력
//		System.out.println("문장을 입력하시오"); // 괄호안 내용을 출력
//		//3) 변수 선언 및 문장 입력
//		//3-1)출력 메시지 1
//		System.out.print("입력1 : "); // 괄호안 내용을 출력
//		//3-1)입력 메소드 1
//		String msg1 = sc.nextLine(); // 문자열 변수 msg1에 한줄 입력 값을 대입
//		//3-2)출력 메시지 2
//		System.out.print("입력2 : "); // 괄호안 내용을 출력
//		//3-2)입력 메소드 2
//		String msg2 = sc.nextLine(); // 문자열 변수 msg2에 한줄 입력 값을 대입
//		//3-3)출력 메시지 3
//		System.out.print("입력3 : "); // 괄호안 내용을 출력
//		//3-3)입력 메소드 3
//		String msg3 = sc.nextLine(); // 문자열 변수 msg3에 한줄 입력 값을 대입
//		//4)결과 출력
//		System.out.println(msg1+"\n"+msg2+"\n"+msg3+"\n"); // "입력값 msg1<줄바꿈>입력값 msg2<줄바꿈>입력값 msg3<줄바꿈>"을 출력
		//5)입력 메소드 해제
//		sc.close(); // 입력 메소드 메모리 해제
		
		//2. 이름과 나이, 취미를 순서대로 입력받기(입력 메소드 이름과 취미 nextLine()사용, 나이는 next()사용)
//		출력 시 printf 사용, 형변환 반드시 젹용해서 출력 할 것, 덧셈연산자 사용
		//이름입력 : 홍길동
		//나이입력 : 20
		//취미입력 : 여행
		//[출력]
		//홍길동은 20살이고 취미는 여행입니다.
		//홍길동은 2026년에 21살입니다.
		
		//1) 입력 클래스 선언 및 import
		Scanner sc = new Scanner(System.in); // 입력 메소드 사용을 위해 입력 클래스를 선언한다.
		//2) 입력 메시지 출력
		System.out.println("정보를 입력하시오"); // 괄호안 내용을 출력
		//3) 변수 선언 및 정보 입력
		//3-1)출력 메시지 1
		System.out.print("이름 입력 : ");	// 괄호안 내용을 출력
		//3-1)입력 메소드 1
		String name = sc.nextLine(); // 문자열 변수 name에 한줄 입력값을 대입
		//3-2)출력 메시지 2
		System.out.print("나이 입력 : "); // 괄호안 내용을 출력
		//3-2)입력 메소드 2
		String age = sc.next(); // 문자열 변수 age에 한단어(버퍼에 엔터가 남는) 입력값을 대입
		sc.nextLine(); // 버퍼에 남아있는 enter 담아주기
		//3-3)출력 메시지 3
		System.out.print("취미 입력 : "); // 괄호안 내용을 출력
		//3-3)입력 메소드 3
		String hobby = sc.nextLine(); // 문자열 변수 hobby에 한줄 입력값을 대입
		//+) 나이 변수 정수형으로 형변환 후 1년 후 나이 더하기
		int ageResult = Integer.parseInt(age); // int형 변수 ageResult에 문자열 형태값 age를 int형으로 변환한 값을 대입
		//4) 결과 출력
		System.out.printf("%s은(는) %d살이고 취미는 %s입니다.\n", name, ageResult, hobby);
						// <name값>은(는) <ageResult값>살이고 취미는 <hobby값>입니다. 를 출력
		System.out.printf("%s은(는) 2026년에 %d살입니다.", name, ageResult + 1);
						// <name값>은(는) 2026년에 <ageResult + 1 값>살입니다. 를 출력
		//5) 입력 메소드 해제
		sc.close(); // 입력 메소드 메모리 해제
		
	}// main 메소드 중괄호 영역 끝

}// 클래스 중괄호 영역 끝
