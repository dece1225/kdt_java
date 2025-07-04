package homework16;

import java.util.Random;

public class P143_4 {
	public static void main(String[] args) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		int dice1 = rand.nextInt(6)+1;
		int dice2 = rand.nextInt(6)+1;
		int count = 0;
		while(true) {
			count++;
			System.out.print(dice1);
			System.out.print(dice2);
			System.out.println();
			if(dice1 == dice2) {
				break;
			}
			
		}
		System.out.println("반복횟수 : "+count);
		System.out.println("주사위 눈의 번호 : "+dice1 + ", "+ dice2);
	}
}
