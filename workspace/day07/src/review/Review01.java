package review;

import java.util.Scanner;

//3번 : 복습문제
public class Review01 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		// 그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기

		// 1)입력클래스 import
		// 2)변수 선언(정수형 변수 1개)
		// 3)입력메시지 출력
		// 4)입력 메소드 변수에 저장
		// 5)if(변수 >= 1 && 변수 <=10){
		// 6)변수의 제곱을 출력
		// }
		// 7)else (그 외의 숫자 입력 시){
		// 8)잘못 입력했습니다 출력
		// }
		// 9)sc.close();

		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("1~10 숫자중에 입력하시오");
//		num = sc.nextInt();
//		if(num >= 1 && num <= 10) {
//			num *= num;
//			System.out.printf("제곱 : %d",num);
//		}else {
//			System.out.println("잘못 입력했습니다.");
//		}

		// 문자열끼리의 비교는 관계연산자(==)를 사용하지 않고
		// .equals() 메소드를 사용해서 비교한다
		System.out.println("문자열1 입력 : ");
		String data1 = sc.nextLine();
		System.out.println("문자열2 입력 : ");
		String data2 = sc.nextLine();
		System.out.println(data1.equals(data2));// true
		if (data1.equals(data2)) {
			System.out.println("두 문자열은 같습니다");
		} else {
			System.out.println("두 문자열은 같지 않습니다");
		}

		sc.close();
	}

}
