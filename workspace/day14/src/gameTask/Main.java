package gameTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Wizard wiz = null;
		Warrior war = null;
		Rogue rog = null;
		int charBtn = 0;
		int menuBtn = 0;
		while(true) {
			System.out.println("1. 마법사, 2.전사, 3.로그");
			System.out.print("캐릭터를 선택 : ");
			charBtn = sc.nextInt();
			if(charBtn == 1) {
				wiz = new Wizard();
				break;
			}else if(charBtn == 2) {
				war = new Warrior();
				break;
			}else if(charBtn == 3) {
				rog = new Rogue();
				break;
			}else {
				System.out.println("번호를 다시 입력하세요");
			}
			
		}
		while(true) {
			if(charBtn == 1) {
				System.out.println("1. 기본공격, 2. 스킬공격, 3. 특수공격, 4. 종료");
				System.out.print("입력 >> ");
				menuBtn = sc.nextInt();
				switch(menuBtn) {
				case 1:
					wiz.normalAttack();
					break;
				case 2:
					wiz.skillAttack();
					break;
				case 3:
					wiz.specialAttack();
					break;
				case 4:
					System.out.println("게임을 종료합니다");
					sc.close();
					return;
				default:
					System.out.println("다시 입력해주세요");
					break;
				}
			}
		}
	}
}
