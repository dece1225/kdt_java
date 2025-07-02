package gameTask;

public class Warrior extends Character{

	public Warrior() {
		super("전사",30,10,5,15,100);
	}
	
	@Override
	public void skillAttack() {
		// TODO Auto-generated method stub
		super.skillAttack();
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		super.specialAttack();
	}
	
	void onlyWarrior() {
		System.out.println("전사만 사용할 수 있는 고유 행동입니다");
	}
	
}
