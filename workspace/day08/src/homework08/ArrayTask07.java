package homework08;

//7. aBcDeF...XyZ 배열에 담고 출력
public class ArrayTask07 {
	public static void main(String[] args) {
		char[] alpha = new char[50]; // char 배열 선언, 50칸 크기 변수 생성
		
		for(int i = 0; i < alpha.length; i++) {
			if(i % 2 == 0) { // 인덱스가 짝수이면
				alpha[i] = (char) (i + 97); // alpha인덱스에 i + 'a' 값을 저장
			}else { // 인덱스가 홀수이면
				alpha[i] = (char) (i + 65); // alpha인덱스에 i + 'A' 값을 저장
			}
			if(alpha[i] == 'Z') { // alpha 인덱스가 'Z'면
				break; // for문 탈출
			}
		}
		for (int i = 0; i< alpha.length; i++) {
			System.out.print(alpha[i]); // alpha 인덱스 출력
		}
	}
}
