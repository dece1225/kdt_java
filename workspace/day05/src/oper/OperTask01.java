package oper;

import java.util.Scanner; // 입력 클래스 import

//13번 : 산술연산자 응용
public class OperTask01 { // 클래스 중괄호 영역 시작

	public static void main(String[] args) { // main 메소드 중괄호 영역 시작
		
		// 코인노래방 프로그램
		// 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
		// 금액 입력 : 1000
		// [출력]
		// 3곡을 부를 수 있으며 잔돈은 100원입니다
		
		//로직구성
		//1)입력 클래스 선언, import
		Scanner sc = new Scanner(System.in); // 입력 메소드 사용을 위한 클래스 선언
		//2)입력 메시지 출력
		System.out.print("금액 입력 : "); // 괄호안 내용 출력
		//3)정수형 변수 선언 -> coin, songCount, finalCoin
		int coin, songCount, finalCoin; // int형 변수 coin, songCount, finalCoin 선언
		final int SONG_PAY = 300; // 고정된 지불값을 상수로 선언 후 300값을 대입한다.
		//4)입력 메소드 실행
		coin = sc.nextInt(); // int형 변수 coin에 정수 입력값을 대입
		//몇 곡을 부르는지 계산
		songCount = coin / SONG_PAY; // int형 변수 songCount에 coin값과 SONG_PAY를 나눈값을 대입
		finalCoin = coin - songCount * SONG_PAY; // coin%PRICE; // int형 변수 finalCoin에 songCount*SONG_PAY값을
															//coin값에서 뺀 값을 대입
		//5)결과 출력 -> 산술연산자 이용하여 계산한 값 출력
		System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원 입니다.", songCount, finalCoin);
						//<songCount값>곡을 부를 수 있으며 잔돈은 <finalCoin값>원 입니다. 를 출력
		//6)입력 클래스 닫기
		sc.close(); // 입력 클래스 메모리 해제
	} // main 메소드 중괄호 영역 끝

}// 클래스 중괄호 영역 끝
