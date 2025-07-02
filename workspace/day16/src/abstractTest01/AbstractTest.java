package abstractTest01;
//4번 : 일반클래스와 추상클래스 객체화 
public class AbstractTest {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a);
		a.method1();
		
		//추상클래스 ClassB 객체화 불가능
//		ClassB b = new ClassB();
		
		//추상클래스 ClassB를 상속받은 일반 클래스 ClassC 객체화
		ClassC c = new ClassC();
		System.out.println(c);
		c.method1();//추상클래스에 정의된 추상메소드, ClassC에서 재정의
		c.method2();
		c.printNumber();
		
		ClassB b= new ClassC();
		System.out.println(b);
		b.method1();//오버라이딩 된 메소드 호출
		//다운캐스팅
		((ClassC)b).printNumber(); 
	}
}
