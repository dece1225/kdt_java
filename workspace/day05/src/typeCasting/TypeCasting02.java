package typeCasting;
//3번 : 문자열 자료형 -> 다른 기본 자료형으로
public class TypeCasting02 {//클래스 중괄호 영역 시작
	public static void main(String[] args) {//main 메소드 중괄호 영역 시작
		//기본자료형 -> 문자열 자료형
		String str1 = 3 + ""; // 문자열 형태 변수 str1에 정수형에서 형변환한 문자열 "3"값을 대입
		String str2 = 6.17 + ""; // 문자열 형태 변수 str2에 실수형에서 형변환한 문자열 "6.17"값을 대입
		String str3 = 'a' + ""; // 문자열 형태 변수 str3에 문자형에서 형변환한 문자열 "a"값을 대입
		String str4 = true + ""; // 문자열 형태 변수 str4에 논리형에서 형변환한 문자열 "true"값을 대입
		
		System.out.println(str1); // str1값 "3"을 출력
		System.out.println(str2); // str2값 "6.17"을 출력
		System.out.println(str3); // str3값 "a"을 출력
		System.out.println(str4); // str4값 "true"을 출력
		
		//문자열 -> 기본자료형으로
		int number1 = Integer.parseInt(str1); // 정수형 변수 number1에 문자열 변수 str1을 형변환한 정수값 3을 대입
		System.out.println(number1); // number1값 3을 출력
		double number2 = Double.parseDouble(str2); // 실수형 변수 number2에 문자열 변수 str2을 형변환한 실수값 6.17을 대입
		System.out.println(number2); // number2값 6.17을 출력
		boolean isTrue2 = Boolean.parseBoolean(str4); // 논리형 변수 isTrue2에 문자열 변수 str4을 형변환한 논리값 true을 대입
		System.out.println(isTrue2); // isTrue2값 true을 출력
		char ch = "hello".charAt(0); // 문자형 변수 ch에 문자열 "hello"중 0번째 인덱스 문자값인 h를 대입
		System.out.println(ch); // ch값 h를 대입
		
	}//main 메소드 중괄호 영역 끝
}// 클래스 중괄호 영역 끝
