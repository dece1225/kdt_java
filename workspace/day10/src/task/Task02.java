package task;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		//Animal 클래스 => 3개 객체만들기
		
		//필드 : 동물이름, 나이, 종
		//메소드
		//동물이 먹이를 먹는 메소드 	매개변수 1개
		//=> 동물이름이 00을 먹습니다
		
		// 동물이 잠을 잡니다 출력하는 메소드
		// => 동물이름이 잠을 잡니다
		
		// 동물의 생일 축하하는 출력 메소드
		// => 동물이름의 나이 생일을 축하합니다 출력
		
		//객체생성
		Scanner sc = new Scanner(System.in);
		
		Animal ani = new Animal();
		ani.name = "";
		ani.age = 0;
		ani.sort = "";
		
		System.out.print("동물 이름을 입력하시오 : ");
		ani.name = sc.next();
		
		System.out.print("동물의 나이를 입력하시오 : ");
		ani.age = sc.nextInt();
		
		System.out.print("동물 종류를 입력하시오 : ");
		ani.sort = sc.next();
		
		System.out.print("먹이를 입력하시오 : ");
		String food = sc.next();
		
		ani.eat(food);
		
		ani.sleep();
		
		ani.birth();
	}
}
