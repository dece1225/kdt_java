package homework15_김태현;

public class Student extends Person{
	//필드
	private boolean stu;

	//생성자
	public Student(String name, boolean stu) {
		super(name);
		this.stu = stu;
	}
	
	//메소드
	void study() {
		System.out.println(super.getName() + "이/가 공부합니다");
	}

	//메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println(super.getName() + "은/는 학생입니다");
	}
	
	
}
