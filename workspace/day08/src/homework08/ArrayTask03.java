package homework08;
//3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
		//1)입력 클래스 생성
		//2)정수형 배열 선언 및 크기 3칸인 변수 생성
		//3)평균을 구하기 위한 합을 담아줄 정수형 변수 생성
		//4)입력 메시지 출력
		//5)값을 담아주는 for문
		//	초기식: int int i = 0;
		//	조건식: i < ar.length
		//	증감식: i++
		//	배열[i] = 입력메소드 사용
		//6)평균을 위한 합을 담아주는 for문
		//	초기식: int int = 0;
		//	조건식: i < ar.length
		//	증감식: i++
		//	변수 += ar[i]
		//7)결과출력
		
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[3];
		int add = 0;
		System.out.print("수학점수를 입력하시오 : ");

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			add += ar[i];
		}
		System.out.printf("%d명의 점수의 평균은 %d입니다", ar.length, add/ar.length);

	}
}
