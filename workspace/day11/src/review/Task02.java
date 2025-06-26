package review;

import java.util.Scanner;

class Animal {
	//필드
	String name; // 이름
	int age; // 나이
	String sort; // 종
	
	//메소드
	//동물이 먹이를 먹는 메소드
	void eat(String food) {
		System.out.printf("%s이/가 %s을/를 먹습니다\n", name, food);
	}
	
	//동물이 잠을 자는 메소드
	void sleep(String place) {
		System.out.printf("%s이/가 %s에서 잠을 잡니다\n", name, place);
	}
	
	//동물의 생일을 축하하는 메소드
	void birth() {
		System.out.printf("%s의 %d 생일을 축하합니다\n",name, age);
	}
}


public class Task02 {
	public static void main(String[] args) {
		Animal dog = new Animal();
		System.out.println(dog);
		System.out.println(dog.name);
		dog.name = "멍멍이";
		dog.age = 1;
		dog.sort = "시츄";
		System.out.println(dog.name);
		dog.birth();
		
		Animal cat = new Animal();
		dog.name = "빵빵이";
		dog.age = 3;
		dog.sort = "코숏";
		System.out.println(cat.name);
		System.out.println(cat.age);
		dog.eat("츄르");
		
		
		
	}
}
