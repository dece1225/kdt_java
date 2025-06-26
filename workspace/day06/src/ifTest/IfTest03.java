package ifTest;

//12번 : if ~ else if ~ else문
public class IfTest03 {//클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작

		System.out.println("출력 시작"); // 괄호안 내용 출력

		int num = 10; // int변수 num에 10값 대입

		if (num > 0) {//if문 시작(num이 0보다 크면)
			System.out.println("양수입니다");//괄호안 내용 출력
		}// if문 끝
		else if (num < 0) {//else if문 시작(num이 0보다 작으면)
			System.out.println("음수입니다");//괄호안 내용 출력
		}//else if문 끝 
		else {//else문 시작(if 조건식이 false이고 else if 조건문이 false이면)
			System.out.println("0입니다");//괄호안 내용 출력
		}//else문 끝

		if (num > 5 && num < 15) { // if문 시작(num이 5보다 크고 15보다 작으면)
			System.out.println("3보다 큽니다");//괄호안 내용 출력
		}//if문 끝 
		else if (num > 5) {// else if문 시작(num이 5보다 크면)
			System.out.println("5보다 큽니다"); // 괄호안 내용 출력
		}//else if문 끝
		else {//else문 시작(if 조건식이 false이고 else if 조건식이 false이면)
			System.out.println(num);//괄호안 내용 출력
		}//else문 끝

		System.out.println("출력 끝");//괄호안 내용 출력

	}// main 영역 끝

}// 클래스 영역 끝
