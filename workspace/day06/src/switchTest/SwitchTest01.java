package switchTest;
//14번 : switch문
public class SwitchTest01 {// 클래스 영역 시작

	public static void main(String[] args) {//main 영역 시작
		
		String animal = "호랑이";//문자열 변수 animal에 "호랑이"값을 대입
		
		switch ("토끼") {//switch문 시작
		case "호랑이"://case가 호랑이값이면
			System.out.println("선택한 동물은 호랑이입니다");//내용 출력
			break;
		case "토끼"://case가 토끼값이면
			System.out.println("선택한 동물은 토끼입니다");//내용 출력
			break;
		case "양"://case가 양값이면
			System.out.println("선택한 동물은 양입니다");//내용 출력
			break;
		default://그외 case면
			System.out.println("선택한 동물이 없습니다");//내용 출력
			break;
		}//switch문 끝
		
		switch(30) {//switch문 시작
		case 10://case가 10이면
			System.out.println("10입니다");//내용 출력
			break;
		case 70://case가 70이면
			System.out.println("70입니다");//내용 출력
			break;
		case 50://case가 50이면
			System.out.println("50입니다");//내용 출력
			break;
		default://그외 case면
			System.out.println("case에 값이 없습니다");//내용 출력
			break;
		}//switch문 끝
	}//main 영역 끝
}//클래스 영역 끝
