package whileTest;
//8번 : while문 기초
public class WhileTest01 {

	public static void main(String[] args) {
		
		//안녕하세요 문자열을 10번 출력하기
		//조건식을 true로 작성시 무한 루프에 빠진다
		while(true) {
			
			System.out.println("안녕하세요");
			break;
		}
		
		//변수 선언
		//while(조건식){}
		int cnt = 0;
		while (cnt <10) {
//			System.out.println(cnt);
			cnt++;
//			System.out.println(cnt);
			System.out.println("안녕하세요");
		}
		
	}

}
