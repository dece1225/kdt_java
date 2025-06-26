package ifTest;

//13번 : if~if문, if~else if문 차이 / if문 중첩
public class IfTest04 {// 클래스 영역 시작

	public static void main(String[] args) {//main 영역 시작
		// if~if문 : 위의 조건식이 true 라도 아래의 if문의 조건식을 확인한다
		int num = 10, grade = 100; // int변수 num과 grade에 각각 10값 과 100값을 대입
		if (num > 5) {//if문 시작(num이 5보다 크면)
			System.out.println("num은 5보다 큽니다");//괄호안 내용 출력
		}//if문 끝
		if (num > 3) {//if문 시작(num이 3보다 크면)
			System.out.println("num은 3보다 큽니다");//괄호안 내용 출력
		}//if문 끝

		// if~else if문 : 위의 조건식이 true면 아래 있는 조건식은 무시된다
		if (num > 5) {//if문 시작(num이 5보다 크면)
			System.out.println("num은 5보다 큽니다.");
		}//if문 끝 
		else if (num > 3) {//else if문 시작(num이 3보다 크면)
			System.out.println("num은 3보다 큽니다.");
		}//else if문 끝

		// if문 중첩
		// 90점 이상은 A, 100점은 만점으로 A 출력
//		if (grade == 100) {
//			System.out.println("만점으로 A");
//		} else if (grade >= 90) {
//			System.out.println("A");
//		}

		if (grade >= 90) {//if문 시작(grade가 90이상이면)
			if (grade == 100) {//if문 시작(grade가 100이면)
				System.out.println("만점으로 A");//괄호안 내용 출력
			}//if문 끝 
			else {//else문 시작
				System.out.println("A");//괄호안 내용 출력
			}//else문 끝
		}
	}//main 영역 끝

}//클래스 영역 끝
