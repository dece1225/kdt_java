package homework08;
//1. 100~1까지의 값을 배열에 넣고 출력
public class ArrayTask01 {

	public static void main(String[] args) {
		//1)정수형배열 선언 및 크기 100칸인 변수 생성
		//2)값을 담아주는 for문
		//	초기식: int i = 배열.length
		//	조건식: i > 0
		//	증감식: i--
		//	배열[인덱스->배열.length-i]에 i값 저장 반복
		//3)값을 출력하는 for문
		//	초기식: int i = 배열.length
		//	조건식: i > 0
		//	증감식: i--
		//	출력 -> 배열[인덱스 -> 배열.length - i]
		int[] arrayNum = new int[100];
		
		for(int i = arrayNum.length; i > 0; i--) {
			arrayNum[(arrayNum.length) - i] = i;
		}
		for(int i = arrayNum.length; i > 0; i--) {
			System.out.println(arrayNum[(arrayNum.length) - i]);
		}
	}

}
