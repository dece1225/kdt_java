package accessModifier04;
//3번 : final
public class SuperCar extends Car{

	@Override
	void speedUp() {
		setSpeed(getSpeed() + 20); // private 필드의 접근은 항상 getter와 setter를 통해 처리
		System.out.println("슈퍼카가 가속합니다 : "+ getSpeed());
	}
	
}
