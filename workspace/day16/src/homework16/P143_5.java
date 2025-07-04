package homework16;

public class P143_5 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 8-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
