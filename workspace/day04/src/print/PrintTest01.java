package print;
//8번 : println(), print() 출력메소드
public class PrintTest01 {// 클래스 중괄호 영역 시작

	public static void main(String[] args) {//main 메소드 시작 중괄호 영역
		//println() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈된다
		System.out.println("\"println()\"는 출력메소드이다.");//"println()"는 출력메소드이다. 를 출력하고 줄바꿈한다.
		System.out.println("자동으로 줄바꿈된다\n");//자동으로 줄바꿈된다<줄바꿈> 를 출력하고 줄바꿈한다.
		
		//print() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈되지 않는다
		System.out.print("\'print()\'도 출력메소드이다.");// 'print()'도 출력메소드이다. 를 출력한다.
		System.out.print("자동으로 줄바꿈되지 않는다."); // 자동으로 줄바꿈되지 않는다. 를 출력한다.
		
		System.out.println("java 수업중입니다.");// java 수업중입니다. 를 출력하고 줄바꿈한다.
		System.out.println("지금은 3시 11분입니다.");// 지금은 3시 11분입니다. 를 출력하고 줄바꿈한다.
	} //main 메소드 중괄호 영역 끝

}// 클래스 중괄호 영역 시작
