package homework16;

public class P143_6 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 4-i; j++) {

			}
			for(int k = 0; k < (2*i)+1; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
