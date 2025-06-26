package homework;

import java.util.Scanner;

public class Day05_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price, pay, change;
		System.out.print("물건값 : ");
		price = sc.nextInt();
		System.out.print("지불금액 : ");
		pay = sc.nextInt();
		change = pay - price;
		int count1000 = change/1000;
		change %= 1000;
		int count500 = change/500;
		change %= 500;
		int count100 = change/100;
		change = pay - price;
		
		
		System.out.printf("거스름돈은 %d원입니다.", change);
		System.out.printf("1000원 : %d개\n", count1000);
		System.out.printf("500원 : %d개\n", count500);
		System.out.printf("100원 : %d개\n", count100);
		
		sc.close();
	}

}
