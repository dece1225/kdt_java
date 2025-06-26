package homework08;
//2. 1~10까지의 값을 배열에 넣고 총 합을 출력
public class ArrayTask02 {
	public static void main(String[] args) {
		//1)정수형 배열 선언 및 크기 10칸인 변수 생성
		//	정수 합결과를 담아줄 변수생성
		//2)값을 담아주는 for문
		//	초기식: int i = 0
		//	조건식: i < 배열.length
		//	증감식: i++
		//	배열[i] = i+1
		//3)배열값들을 합해주는 for문
		//	초기식: int i = 0
		//	조건식: i < 배열.length
		//	증감식: i++
		//	결과변수 += 배열[i]
		//syso(결과변수)
		
		int[] ar1 = new int[10];
		int result = 0;
		
		for(int i = 0; i<ar1.length; i++) {
			ar1[i] = i+1;
		}
		for(int i = 0; i<ar1.length; i++) {
			result += ar1[i];
		}
		System.out.printf("1~%d까지의 합은 %d입니다", ar1.length,result);
		
	}
}
