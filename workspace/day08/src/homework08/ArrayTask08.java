package homework08;

import java.util.Scanner;

//8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력
public class ArrayTask08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 입력클래스 선언

		int[] arrNum = new int[5]; // 정수 배열 선언, 5칸 크기 변수 생성
		System.out.println("정수 5개를 입력하시오");// 입력 메시지 출력
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = sc.nextInt();// 배열 인덱스에 입력받은 값 저장
		}
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = 0; j < arrNum.length - 1; j++) {
				int temp = 0; // 임시로 값을 저장할 변수
				if (arrNum[j] > arrNum[j + 1]) { // j인덱스 값이 j+1의 값보다 크면
					temp = arrNum[j]; // 임시 변수에 j인덱스 변수값을 저장하고
					arrNum[j] = arrNum[j + 1];// j인덱스 변수에 j+1인덱스 값을 저장하고
					arrNum[j + 1] = temp; // j+1 인덱스 값을 임시 변수에 저장한다.
					// 이를 통해 정수들을 정렬
				}
			}
		}

		System.out.printf("최대값 : %d, 최소값 : %d", arrNum[4], arrNum[0]);
		// 끝의 인덱스는 최대값, 시작 인덱스는 최소값
	}
}
