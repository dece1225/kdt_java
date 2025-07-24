package objectTest;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("김태현", 22);
		System.out.println(p1);
		System.out.println(p1.toString()); //objectTest.Person@2ff4acd0
		
		Person p2 = new Person("김태현", 22);
		Person p4 = new Person("김태현", 20);
		System.out.println(p2); //objectTest.Person@54bedef2
		
		Person p3 = new Person("홍길동", 22);
		System.out.println(p3); //다른 주소값
		
		//equals 메소드 재정의 전이기 때문에 객체의 주소값으로 비교
		//모두 다른 주소값을 가지므로 false 반환됨
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
	}
}
