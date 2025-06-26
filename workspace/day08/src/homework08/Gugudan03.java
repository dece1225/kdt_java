package homework08;

public class Gugudan03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i += 3) { 
			for (int j = i; j < i + 3 && j <= 9; j++) {
				System.out.printf("%d단\t\t", j);
			}
			System.out.println();

			for (int k = 1; k <= 9; k++) {
				for (int j = i; j < i + 3 && j <= 9; j++) {	
					System.out.printf("%d X %d = %d\t", j, k, j * k);
				}
				System.out.println();
			}
		}

	}

}
