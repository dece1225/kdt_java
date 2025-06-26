package homework08;

//6. A ~ F까지 중 C만 제외하고 배열에 담아 출력
public class ArrayTask06 {

	public static void main(String[] args) {
		char[] ch = new char [10]; // char 배열 선언, 10칸 크기 변수 생성

		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (i + 65); // // ch인덱스에 i + 65 => i + 'A' 저장
			if (ch[i]=='C') { // ch인덱스 값이 'C'와 같으면
				ch[i] = '\0'; // 그 자리 값을 공백으로 초기화
			}
			if (ch[i]=='F') {// ch 인덱스 값이 'F'면
				break; // for문 탈출
			}
		}
		
		for (int i = 0; i< ch.length; i++) {
			System.out.println(ch[i]); // ch인덱스 값 출력
		}
	}

}
