package homework;

import java.util.Scanner;

public class Day05_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		String age = sc.next();
		int ageInt = Integer.parseInt(age);
		System.out.printf("%s님의 내년 나이는 %d살 입니다.\n", name, ageInt + 1);
		System.out.printf("만 나이는 %d살 입니다.", ageInt - 1);

	}

}
