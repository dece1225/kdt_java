package oper;

//3번 : 관계연산자와 논리연산자
public class OperTest01 {// 클래스 영역 시작

	public static void main(String[] args) {//main 영역 시작
		System.out.println("==========관계연산자===========");//괄호안 내용출력

		int num1 = 10, num2 = 20, num3 = 10; // int변수 num1, num2, num3에 각각 10, 20, 30값 대입
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));//10 > 20 : false
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));//10 < 20 : true
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));//10 >= 20 : false
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));//10 <= 20 : true
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));//10 == 20 : false
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));//10 != 20 : true
		System.out.println(num1 + " == " + num3 + " : " + (num1 == num3));//10 == 10 : true

		System.out.println(10 >= 10); // true

		System.out.println("\n==========논리 연산자===========");
		System.out.println("and : 둘 다 참이면 참(&&)");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println("or : 둘 중 하나라도 참이면 참(||)");
		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println("\nnot : 참이면 거짓, 거짓이면 참(!)");
		System.out.println(!true); // false
		System.out.println(!false); // true

	}//main 영역 끝

}//클래스 영역 끝
