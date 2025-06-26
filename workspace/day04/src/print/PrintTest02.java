package print;
//9번 : printf() 출력메소드
public class PrintTest02 {//클래스 중괄호 영역 시작

	public static void main(String[] args) {// main 메소드 중괄호 영역 시작
		
//		String name = "김태현";
//		int age = 20;		
//		System.out.println("제 이름은 김태현이고, 나이는 20살 입니다.");
//		System.out.println("제 이름은 " + name + "이고, 나이는 " + age +"살 입니다.");
//		System.out.printf("제 이름은 %s이고, 나이는 %d살 입니다.",name, age);
		
		//정수형
		int num1 = 200;// 정수형 num1 변수를 선언후, 200 값을 대입한다.
		System.out.printf("10진수 : %d\n", num1); // 10진수 : <num1값><줄바꿈> 을 출력한다.
		System.out.printf("10진수 : %d\n", 10);// 10진수 : 10<줄바꿈>을 출력한다.
		System.out.printf("8진수 : %o\n", 8);// 8진수 : 10을 출력한다.
		System.out.printf("16진수 : %x", 11); // 16진수는 10 A, 11 B, ... 15 F, 16 => 10
		//16진수 : b를 출력한다.
		
		//실수형
		System.out.printf("\n실수형 : %f\n", 3.1234567);// <줄바꿈>실수형 : 3.123457 을 출력한다.
		//float 타입 => 소수점이하 6자리까지 정확하게 나옴, 7자리이상이면 7번째 자리에서 반올림
		double num2 = 3.123456789123456; //소수점이하 15자리까지 정확하게 나옴
//		float num3 = 3.12345678912345;
		System.out.println(num2);// num2 실수형 변수의 값을 출력후 줄바꿈한다. 
		
		System.out.printf("\n실수형 2자리까지 표현 : %.2f\n", 3.12345);// <줄바꿈>실수형 2자리까지 표현 : 3.12 을 출력한다.
		
		//문자형
		System.out.printf("\n문자형 : %c", 'a');// <줄바꿈>문자형 : a 을 출력한다.
		
		//문자열
		System.out.printf("\n문자열 : %s\n", "hello");// <줄바꿈>문자열 : hello 을 출력한다
		String data = "hello,java";// 문자열 data 변수를 선언하고 "hello,java"문자열 값을 대입한다.
		System.out.println(data);// 문자열 data 변수의 값을 출력하고 줄바꿈한다.
		System.out.printf("문자열 : %.5s", data);//data 변수의 값중 hello까지 출력한다.
		
		//논리형(형식지정자 x)
		System.out.printf("\n논리형 : %s", true);//<줄바꿈>논리형 : true 를 출력한다.
		System.out.printf("\n논리형 : %.1s", true);//<줄바꿈>논리형 : t 를 출력한다.
	}//main 메소드 중괄호 영역 끝

}// 클래스 중괄호 영역 끝
