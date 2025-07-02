package review;

public class Teacher extends Person {

	// 생성자
	public Teacher(String name) {
		super(name);
	}

	// 메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println("저는 선생님입니다");
	}

	void teach() {
		System.out.println(getName() + "이/가 가르칩니다");
	}
}
