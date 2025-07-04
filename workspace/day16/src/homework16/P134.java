package homework16;

public class P134 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for(int k = 0; k < (2*i)+1; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 7-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
