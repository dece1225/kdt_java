package homework08;

public class Gugudan04 {
	public static void main(String[] args) {
		int dan = 2; // 시작 단수 2를 정수형 변수에 저장

		while (dan <= 9) {// 단수가 9 까지
			System.out.printf("%d단\t\t", dan); // 출력
			dan++;// 단수 1증가
		}
		System.out.println();

		int i = 1; // 곱할 값을 정수형 변수에 저장
		while (i <= 9) { // 곱한 값이 9일때 까지
			dan = 2;// 단수를 다시 2로 초기화
			while (dan <= 9) { // 단수가 9까지
				System.out.printf("%d X %d = %d\t", dan, i, dan * i);// 출력
				dan++;// 단수 1증가
			}
			System.out.println();
			i++; // 곱해줄 수 1증가
		}
	}
}
