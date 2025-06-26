package print;

//10번 : 서식문자의 옵션 printf()
public class PrintTest03 {//클래스 중괄호 영역 시작

	public static void main(String[] args) {// main 메소드 중괄호 영역 시작
		System.out.println("============================");
		// 기본 형식지정자
//		System.out.printf("이름 : %s, 나이 : %d\n", "김태현", 20);
//		System.out.printf("%d.%.2f 날씨 : %s\n", 2025, 6.16, "흐림" );
//		//2025.6.16 날씨 : 흐림
//		System.out.printf("%s %c", true, 'a');
//		
		//자리수를 지정한 출력
		System.out.println("============================");
		//%[왼쪽 - or 0][n][.m]서식문자
		String subject = "java"; // 문자열 subject 변수선언하고 "java" 문자열값을 대입한다 
		System.out.printf("%10s\n",subject); // 10자리 기준 오른쪽 정렬 /       java를 출력한다
		System.out.printf("%-10s\n",subject); // 10자리 기준 왼쪽 정렬 / java      를 출력한다
		System.out.printf("%10s %05d\n",subject, 500);//       java 00500를 출력한다
		System.out.printf("%-5s", "김태현");//김태현  를 출력한다.
		
		//상품명과 가격정렬
		System.out.println("\n\n============메뉴=============");
		System.out.printf("%-5s\t\t%5d원","꼬북칩", 2500); 	//꼬북칩  		 2500원를 출력한다
		System.out.printf("\n%-5s\t\t%5d원","누네띠네", 3000);	//누네띠네 		 3000원를 출력한다
		System.out.printf("\n%-5s\t\t%5d원","껌", 800);		//	껌    		  800원를 출력한다
	}//main 메소드 중괄호 영역 끝

}//클래스 중괄호 영역 끝
