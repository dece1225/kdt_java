package task;

public class Animal {
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
	void sleep() {
		System.out.printf("%s이/가 잠을 잡니다\n", name);
	}
	
	//동물의 생일을 축하하는 메소드
	void birth() {
		System.out.printf("%s의 %d 생일을 축하합니다\n",name, age);
	}
}
