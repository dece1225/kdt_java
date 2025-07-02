package homework15_김태현;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("누구누구");
		Person student = new Student("김태현", true);
		Person teacher = new Teacher("김영선");
		Person employee = new Employee("이음길");
		
		person.setAge(20);
		person.setBirth("250701");
		
		//introduce 오버라이딩
		person.introduce();
		student.introduce();
		teacher.introduce();
		employee.introduce();
		
		System.out.println();
		
		//printInfo
		Main.printInfo(person);
		Main.printInfo(student);
		Main.printInfo(teacher);
		Main.printInfo(employee);
	}
	
	static void printInfo(Person person) {
		if(person instanceof Student) {
			((Student)person).study();
		}else if(person instanceof Teacher) {
			((Teacher)person).teach();
		}else if(person instanceof Employee) {
			((Employee)person).work();
		}else {
			System.out.println("직업이 없습니다");
		}
	}
}
