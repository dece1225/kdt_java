package ex01_KTH;

public class Student extends Person{
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	
	
	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public void score() {
		System.out.println(super.getName() + "의 점수는" + this.getScore() + "점 입니다");		
	}

	
	
}
