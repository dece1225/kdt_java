package homework08;

//4. 0 1 2 3 0 1 2 3 배열에 담고 출력
public class ArrayTask04 {

	public static void main(String[] args) {
		int[] arr = new int[8]; // 정수형 배열 생성 및 크기 8칸 변수 생성  
		int num = 0; // 배열에 담아줄 변수

		//값을 담아줄 for문
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length / 2) { // 인덱스 중간지점에 도달하지 않았다면
				arr[i] = num;// 초기값이 0인 num을 배열에 저장
				num++; // num을 1씩 증가
			} else {// 인덱스 중간지점에 도달했으면
				num = 0; // num을 다시 0으로 초기화
				num++; // num을 다시 1씩 증가
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// arr 배열 값 출력
		}
	}

}
