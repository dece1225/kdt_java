package review;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("홍길동");
		Student s = new Student("신짱구", true);
		Teacher t = new Teacher("김철수");
		Employee e = new Employee("최유리");
		printInfo(p);
		printInfo(s);
		printInfo(t);
		printInfo(e);
		System.out.println(s.isStu());

	}

	// static 메소드 정의
	static void printInfo(Person p) {
		p.introduce();
		if (p instanceof Student) {
			// 다운캐스팅
			((Student) p).study();
		} else if (p instanceof Teacher) {
			// 다운캐스팅
			((Teacher) p).teach();
		} else if (p instanceof Employee) {
			// 다운캐스팅
			((Employee) p).work();
		}
	}
}
