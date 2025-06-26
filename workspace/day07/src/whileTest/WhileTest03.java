package whileTest;

import java.util.Scanner;

// 10번 : while문 예제
public class WhileTest03 {//클래스 시작 영역
   public static void main(String[] args) {//main 시작 영역

      // 2개의 정수를 입력받아서 두 정수의 합을 출력
      // 0을 입력하면 종료, 1을 입력하면 계속 반복
      // while문 사용
      // 기타제어문 사용

      // 1) 정수형 변수 2개 선언(두 정수 합 구할 변수, 종료/반복 입력받을 변수), 입력클래스 import
      // 2) 반복문 while 무한반복(true)
      // 3) while 중괄호 영역 {
      // 3-1) 입력메시지출력
      // 3-2) 변수2개 선언 입력메소드 입력받기
      // 3-3) 두 정수 합 구할변수 덧셈연산
      // 3-4) 두정수의 합 출력
      // 3-5) 종료/계속할 지 출력 메시지
      // 3-6) 종료/반복 입력받기
      // 4) 조건문 if 종료라면 == 0{
      // 4-1) 종료 메시지 출력
      // 4-2) break; }
      // 5) 조건문 if 계속이라면 == 1 {
      // 5-1) 계속 진행합니다 메시지 출력
      // 5-2) continue;
      // }
      // 5-3) 프로그램 출력
      // }
      // 반복문을 종료합니다
      // sc.close();

      int result = 0, choice = 0;	//int 변수 result, choice에 초기값 0 저장
      Scanner sc = new Scanner(System.in); // 입력 클래스 선언
      while (true) {//while문 시작(무한루프)
         System.out.println("2개의 정수 입력(입력시 1, 0 제외) : ");//괄호안 내용 출력
         int num1 = sc.nextInt();//int 변수 num1에 입력 메소드 사용
         int num2 = sc.nextInt();//int 변수 num2에 입력 메소드 사용
         result = num1 + num2;//int형 변수 result에 num1과 num2를 더한 값 저장
         System.out.println(num1 + " + " + num2 + " = " + result); // "num1 + num2 = result" 출력
         System.out.println("계속 : 1, 종료 : 0을 누르세요 : ");//괄호안 내용 출력
         choice = sc.nextInt();//int형 변수 choice에 입력메소드 사용
         if (choice == 0) {//if문 시작(조건식:choice가 0과 같으면)
            System.out.println("종료");//괄호안 내용 출력
            break;//while문 탈출
         }//if문 끝
         if (choice == 1) {//if문 시작(조건식:choice가 1과 같으면)
            System.out.println("계속 진행합니다");//괄호안 내용 출력
            continue;//다음 반복으로 건너뛰기
         }//if문 끝
         System.out.println("프로그램"); // 실행되지 않음
      }
      System.out.println("반복문을 종료합니다");//괄호안 내용출력

   }//main 끝 영역
}//클래스 끝 영역
