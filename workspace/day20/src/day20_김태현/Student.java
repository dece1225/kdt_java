package day20_김태현;

public class Student {
	//필드
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Student) {
			int other = ((Student)obj).age;
			this.age = other;
		}
		return false;
	}

	

	@Override
	public int hashCode() {
		return Integer.hashCode(age);
	}



	public int total(int math, int eng, int kor) {
		return this.getMath() + this.getEng() + this.getKor();
	}
	
	public int printAvg() {
		return total(math, eng, kor)/3;
	}
	
	public int addScore() {
		
	}
	
	
	
}
