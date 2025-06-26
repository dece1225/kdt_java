package twoForTest;

public class Gugudan02 {
	public static void main(String[] args) {
		//단 for문	초기식 -> int i = 1
		//			조건식 -> i < 10
		//			증감식 -> i++
		//	printf(%d단\t\t,i)
		//바깥 for문	초기식 -> int i = 1
		//			조건식 -> i < 10
		//			증감식 -> i++
		//안쪽 for문	초기식 -> int j = 2
		//			조건식 -> j < 10
		//			증감식 -> j++
		//	printf(%d X %d = %d, j,i,i*j)
		//print(\n)
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d단\t\t",i+1);
		}
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d X %d = %2d\t", j, i, i*j);
			}
			System.out.println();
		}
		
	}
}
