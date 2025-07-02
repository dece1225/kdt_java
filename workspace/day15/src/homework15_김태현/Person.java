package homework15_김태현;

public class Person {
	//필드
	private String name;
	private int age;
	private String birth;

	//생성자
	public Person(String name) {
		super();
		this.name = name;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	void introduce() {
		System.out.println(this.name + ", " + this.age + "살 입니다");
	}
	
}
