package homework15_김태현;

public class Teacher extends Person{

	//생성자
	public Teacher(String name) {
		super(name);
	}
	
	//메소드
	void teach() {
		System.out.println(super.getName() + "이/가 가르칩니다");
	}

	@Override
	void introduce() {
		System.out.println("저는 선생님입니다");
	}
	
	
}
