package homework08;

//5. A ~ F까지를 배열에 값을 넣고 출력
public class ArrayTask05 {

	public static void main(String[] args) {
		char[] ch = new char [10];// char 배열 선언, 10칸 크기의 변수 생성

		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (i + 65); // ch인덱스에 i + 65 => i + 'A' 저장
			if (ch[i]=='F') { // ch인덱스 값이 'F'면
				break; // for문 탈출
			}
		}
		
		for (int i = 0; i< ch.length; i++) {
			System.out.println(ch[i]);//ch배열 값 출력
		}
	}

}
