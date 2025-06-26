package methodTest;

import java.util.Scanner;

public class MethodTask02 {
	// 1.
	// 기능 => 짝수인지 홀수인지 반환
	// 리턴타입 == void
	// 메소드명 == checkNum
	// 매개변수 == 정수형 1개
	// 구현부 실행할 문장 == 변수or바로리턴 = 정수매개변수 % 2 == 0 ? "짝수입니다" : "홀수입니다"
	// 리턴값 == return 변수 or 바로리턴
	// 리턴타입을 String으로 변환
	String checkNum(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}

	// 2.
	// 기능 => 배열의 총합을 계산하여 반환
	// 리턴타입 == void
	// 메소드명 == getSum
	// 매개변수 == 정수배열 1개
	// 구현부 실행할 문장 == for문 사용
	// for(int i = 0; i < 정수배열.length; i++){
	// 정수형 총합변수 += 정수배열[i] }
	// 리턴값 == return 총합변수
	// 리턴타입을 int로 변환
	int getSum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	// 3.
	// 기능 => 문자열 거꾸로 뒤집어 반환
	// 리턴타입 == void
	// 메소드명 == reverseStr
	// 매개변수 == 문자열 변수 1개
	// 구현부 실행할 문장 == for문 사용
	// for(int i = 0; i < 문자열 변수.length; i++){
	// 뒤집은문자열담을변수 += 문자열.charAt(str.length()-i)} -> 새변수에 문자열을 문자하나로 떼어내서 뒤에 문자부터
	// 연결해준다.
	// 리턴값 == return 문자열 변수
	// 리턴타입 String로 변환
	String reverseStr(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse += str.charAt(str.length() - i - 1);
		}
		return reverse;
	}

	// 4.
	// 기능 => 배열 요소를 비교하여 배열에 존재하면 true 반환
	// 리턴타입 == void
	// 메소드명 == contains
	// 매개변수 == 정수형 배열, 정수형 변수
	// 구현부 실행할 문장 == for문 사용
	// for(int i = 0; i < 정수형 배열.length; i++){
	// 불리안 변수를 false로 초기화
	// 정수형변수에 배열[i] 저장
	// if(num == 10){
	// 불리안변수 true로 저장 }
	// 리턴값 == return equalNum
	// 리턴타입 boolean로 변환
	boolean contains(int[] ar, int num) {
		boolean equalNum = false;
		for (int i = 0; i < ar.length; i++) {
			num = ar[i];
			if (num == 10) {
				equalNum = true;
			}
		}
		return equalNum;
	}

	// 5.
	// 기능 => 입력받은 단수를 바탕으로 구구단 출력
	// 리턴타입 == void
	// 메소드명 == printGugudan
	// 매개변수 == 정수형 변수 1개
	// 구현부 실행할 문장 == for문 사용
	// for(int i = 0; i < 정수형 변수; i++){
	// for(int j = 1; j <= 19; j++){
	// syso(i X j = i*j);
	// 리턴값 == 없음
	void printGugudan(int num) {
		for (int i = 1; i <= 19; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
	}

	// 6.
	// 기능 => 문자열의 길이를 비교하여 같은지 다른지 반환
	// 리턴타입 == void
	// 메소드명 == compareLength
	// 매개변수 == String 변수1, String 변수2
	// 구현부 실행할 문장
	// String 변수 = 변수1.length() == 변수2.length() ? "같음" : "다름"
	// 리턴값 == String 변수
	// 리턴타입 == String
	String compareLength(String str1, String str2) {
		String printEquals = str1.length() == str2.length() ? "같음" : "다름";
		return printEquals;
	}

	// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
	// loginTry
	// 리턴타입 => void => String
	// 메소드명 => loginTry
	// 매개변수 => 문자열 2개
	// 구현부 =>
	// 고정값 id, pw 선언(상수)
	// 횟수 확인할 변수1 선언
	// if문 변수1 >= 3
	// return 계정잠금
	// if문 상수id.equals(매개변수id) && 상수pw.equals(매개변수pw)
	// 변수1 초기화
	// return 로그인 성공
	// else{
	// 변수1++
	// if(변수1 >= 3){
	// return 계정잠금}
	// return 로그인실패
	// }
	// }}

	// 메소드 밖에서 클래스 안에 변수 선언
//	int tryCount = 0;
//
//	String loginTry(String inputId, String inputPw) {
//		final String ID = "admin";
//		final String PW = "1234";
//
//		if (tryCount >= 3) {
//			return "계정잠금";
//		}
//		if (ID.equals(inputId) && PW.equals(inputPw)) {
//			return "로그인 성공";
//		} else {
//			if (tryCount >= 3) {
//				return "계정잠금";
//			}
//			tryCount++;
//			return "로그인실패";
//		}
//	}
	// loginTry(검증만)
	String loginTry1(String inputId, String inputPw) {
		final String ID = "admin";
		final String PW = "admin";

		if (ID.equals(inputId) && PW.equals(inputPw)) {
			return "로그인성공";
		}
		return "로그인 실패";
	}

	public static void main(String[] args) {
		MethodTask02 mt = new MethodTask02();
		Scanner sc = new Scanner(System.in);
		// 1. 정수 1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
		// 메소드명 : checkNum
//		int num = 0;
//		System.out.print("정수를 한 개 입력 : ");
//		num = sc.nextInt();
//		System.out.println(mt.checkNum(num));

		// 2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
		// 메소드명 : getSum
//		int[] arNum = new int[10];
//		System.out.print("10개의 정수를 입력 : ");
//		for (int i = 0; i < arNum.length; i++) {
//			arNum[i] = sc.nextInt();
//		}
//		System.out.println("총합은 : " + mt.getSum(arNum));

		// 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
		// 메소드명 : reverseStr
		// hello => olleh
//		String str = "";
//		System.out.print("문자열을 입력하시오 : ");
//		str = sc.next();
//		System.out.println("반전된 문자열 : " + mt.reverseStr(str));

		// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
		// 메소드명 : contains
		// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//		syso(메소드명(배열명, 10)) => true
//		int[] ar = new int[10];
//		int num = 0;
//		System.out.print("정수를 입력하시오 : ");
//		for(int i = 0; i < ar.length; i++) {
//			ar[i] = sc.nextInt();
//			num = ar[i];
//		}
//		System.out.println(mt.contains(ar, num));

		// 5. 단수를 매개변수로 받아 해당 단의 구구단(1~19)을 출력하는 메소드
		// 메소드명 : printGugudan
//		System.out.print("단수를 입력하시오 : ");
//		int num = sc.nextInt();
//		mt.printGugudan(num);

		// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환
		// 메소드명 : compareLength
//		String str1 = "";
//		String str2 = "";
//		System.out.print("비교할 문자열 두개를 입력하시오 : ");
//		str1 = sc.next();
//		str2 = sc.next();
//		System.out.println(mt.compareLength(str1, str2));

		// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
		// LoginTry
		int tryCount = 0;
		String id = "";
		String pw = "";
		String result = "";
		while (true) {
			System.out.print("아이디를 입력하시오 : ");
			id = sc.nextLine();
			System.out.print("패스워드를 입력하시오 : ");
			pw = sc.nextLine();

			result = mt.loginTry1(id, pw);

			if (result.equals("로그인 성공")) {
				System.out.println("로그인성공");
				break;
			} else {
				tryCount++;
				if (tryCount >= 3) {
					System.out.println("3회 이상 실패로 계정 잠금");
					break;
				}
				System.out.println("로그인 실패");
			}
		}

		sc.close();
	}
}
