package variable;
//5번 : 변수와 상수의 차이
public class Variable04 {// 클래스 중괄호 영역 시작
	public static void main(String[] args) {// main 메소드 중괄호 영역 시작
		
		// student라는 변수에 20이라는 값을 저장한다
		int student = 20;
		
		// MAX_STUDENT라는 상수에 25라는 값을 저장한다.
		final int MAX_STUDENT = 25;
		
		// 출력
		System.out.println(student); //student 변수에 저장된 정수형 값 20을 출력하고 줄바꿈한다  
		System.out.println(MAX_STUDENT);//MAX_STUDENT 상수에 저장된 정수형 값 25를 출력하고 줄바꿈한다  
		
		//변수에 저장되어있는 값 변경
		student = 25;
		System.out.println(student);//student 변수에 저장된 정수형 값 25을 출력하고 줄바꿈한다
		
		//상수에 저장되어있는 값 변경 불가
//		MAX_STUDENT = 20;
		
	} //main 메소드 중괄호 영역 끝
}// 클래스 중괄호 영역 끝
