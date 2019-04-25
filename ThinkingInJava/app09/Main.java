package app09;

public class Main {

	public static void main(String[] args) {

		int i = 0;

		outer:

		while (true) {
			System.out.println("Зовнішній цикл");

			while (true) {
				i++;
				System.out.println("i = " + i);

				if (i == 1) {
					System.out.println("continua");
					continue;
				}

				if (i == 2) {
					System.out.println("continue outer");
					continue outer;
				}

				if (i == 3) {
					System.out.println("break");
					break;
				}

				if (i == 4) {
					System.out.println("break outer");
					break outer;
				}

			}

		}
		
	System.out.println("end");
	}

}
