package typeCasting;
//11번 : 자동 형변환
public class TypeCasting01 {//클래스 중괄호 영역 시작

	public static void main(String[] args) { //main 메소드 중괄호 영역 시작
		//1)작은 자료형의 값을 큰 자료형으로 변환
		// int(4byte) -> long(8byte)
		int iVal = 100; // ival 정수형 변수 선언후 100값을 대입
		long result1 = iVal; //int형 값 100을 long타입 변수에 대입(자동형변환)
		System.out.println(iVal);// 100을 출력후 줄바꿈
		System.out.println(result1);// 100을 출력후 줄바꿈
		
		//int(4byte) -> float(4byte)
		float result2 = iVal; // float형 변수 result2에 int형 변수 iVal값 을 대입
		System.out.println(result2);// 100.0 출력후 줄바꿈
		
		//int(4byte) -> double(8byte)
		double result3 = iVal;// double형 변수 result3에 int형 변수 iVal값을 대입
		System.out.println(result3);// 100.0 출력후 줄바꿈
		
		//double(8byte) -> long(8byte)
//		long result4 = result3;
		//result3은 100.0 실수 타입으로 정수형 변수에 담길 경우 소수점의 손실이 발생하므로 자동형변환 불가능
		
		// float(4byte) -> double(8byte)
		double result4 = result2;
//		float result5 = result3;
		//double 타입의 값은 float 타입에 담을 수 없다. 소수점의 손실이 발생하기 때문
		//double 타입 : 소수점 이하 15자리까지, float 타입 : 소수점 이하 6자리까지
		
		
		//2) 연산시 자동 형변환
		// 정수와 실수의 연산
		int iVal2 = 10;// int형 변수선언후 10값 대입
		double dVal2 = 3.14; // double형 변수 선언후 3.14값 대입
		System.out.println(iVal2 + dVal2); //13.14값 출력 후 줄바꿈
		double result6 = iVal2 + dVal2;// double형 변수선언후 iVal2와 dVal2의 연산값을 대입
		System.out.println(result6); // 13.14값 출력 후 줄바꿈
		
		//3) 문자형에서 정수형으로 변환
		char letter = 'a';// 문자형 변수에 'a'값 대입
		int ascii = letter;// 정수형 변수에 문자형 변수값 대입
		System.out.println(letter);//a 출력 후 줄바꿈
		System.out.println(ascii);// 97출력후 줄바꿈
		
		char letter2 = 'b';// 문자형 변수에 'b'값 대입
		int ascii2 = letter2;// 정수형 변수에 문자형 변수값 대입
		System.out.println(letter2);// b 출력후 줄바꿈
		System.out.println(ascii2);// 98 출력후 줄바꿈
		
		char letter3 = 'A'; // 문자형 변수에 'A'값 대입
		int ascii3 = letter3;// 정수형 변수에 문자형 변수값 대입
		System.out.println(letter3);// A 출력후 줄바꿈
		System.out.println(ascii3);// 65출력후 줄바꿈
		
		char letter4 = '가';// 문자형 변수에 '가' 값 대입
		int ascii4 = letter4;// 정수형 변수에 문자형 변수값 대입
		System.out.println(letter4);// 가 출력후 줄바꿈
		System.out.println(ascii4);//44032 출력후 줄바꿈
	}//main 메소드 중괄호 영역 끝

}// 클래스 중괄호 영역 끝
