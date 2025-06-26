package task;

import java.util.Scanner;

//메소드 문제
public class Task01 {
	// 1. 문자열 속의 단어를 공백 기준으로 세기
	// 메소드명 : countWord
	// 매개변수 : String str
	// ex) I love java => 3개
	// ex) 안녕하세요 저는 김영선입니다 java 공부 중입니다 => 6개
	// 기능 => 단어를 공백기준으로 세기
	// 리턴타입 => void
	// 구현할 코드작성 =>for문 사용
	// for(int i = 0; i < str.length(); i++){
	// 문자열에서 공백을 찾아서 count 증가
	// 최종적으로 나온 count에 1을 더한다
	// 리턴값 = return count
	// 리턴타입 int로 변경
	int countWord(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') { // 공백 뒤에 공백이 오면 카운트를 -1
				count--;
			}
		}
		return count + 1;
	}

	// 2. 주민등록번호로 성별 판단하기
	// 메소드명 : getGender
	// 1, 3 => 남자
	// 2, 4 => 여자
	// 기능 => 주민등록번호 숫자로 성별을 반환
	// 리턴타입 => void
	// 매개변수 => int num
	// 구현할 코드작성 => 주민등록번호의 뒷자리의 맨 앞을 1,2,3,4에 비교하여 성별로 반환
	// 리턴값 = return gender
	// 리턴타입 String으로 변환
	String getGender(int num) {
		String change = num + "";
		String gender = "";
		if (change.charAt(0) == '1' && change.charAt(0) == '3') {
			gender = "남자";
		} else if (change.charAt(0) == '2' && change.charAt(0) == '4') {
			gender = "여자";
		} else {
			gender = "잘못된 값";
		}
		return gender;
	}

	// 3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하기(정수형)
	// 각 학생별 학점 구하기
	// 메소드명 : getGrade
	// 95점 이상 A+
	// 90점 이상 A
	// 85점 이상 B+
	// 80점 이상 B
	// 75점 이상 C+
	// 70점 이상 C
	// 69점 이하 F
	// 기능 => 평균으로 학점 반환
	// 리턴타입 => void
	// 매개변수 => int math, kor, eng
	// 구현할 코드작성 => avg = (math + kor + eng) / 3
	// avg를 각 점수와 비교해 학점 반환
	// 리턴값 = return Grade
	// 리턴타입 String 반환
	String getGrade(int math, int kor, int eng) {
		int avg = (math + kor + eng) / 3;
		String grade = "";
		if (avg >= 95) {
			grade = "A+";
		} else if (avg >= 90) {
			grade = "A";
		} else if (avg >= 85) {
			grade = "B+";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 75) {
			grade = "C+";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg <= 69) {
			grade = "F";
		} else {
			grade = "err";
		}
		return grade;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task01 t = new Task01();

		// 1.
//		System.out.print("문장을 입력하시오 : ");
//		String str = sc.nextLine();
//		System.out.println("단어 개수는" + t.countWord(str) + " 개");

		// 2.
//		System.out.print("주민번호 뒷자리를 입력하세요 : ");
//		int num = sc.nextInt();
//		System.out.println("성별은 " + t.getGender(num) + "입니다");

		// 3.
		System.out.println("수학점수를 입력");
		int math = sc.nextInt();
		System.out.println("영어점수를 입력");
		int eng = sc.nextInt();
		System.out.println("국어점수를 입력");
		int kor = sc.nextInt();
		
		System.out.println("학점은 "+ t.getGrade(math, kor, eng) + "입니다");
		
		
		
	}
}
