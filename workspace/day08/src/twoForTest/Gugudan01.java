package twoForTest;

import java.util.Iterator;

public class Gugudan01 {
	public static void main(String[] args) {
		//바깥 for문 	초기식 -> int i = 2
		//			조건식 -> i < 10
		//			증감식 -> i++
		//	printf("%d단",i)
		//안쪽 for문	초기식 -> int j = 1
		//			조건식 -> i < 10
		//			증감식 -> j++
		//	printf("%d X %d = %d",i,j,i*j);
		//println();
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d단\n",i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
	}
}
