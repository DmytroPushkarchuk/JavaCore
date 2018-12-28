package app08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();

		System.out.println((random.nextInt(2) == 1 ? "парне " + 2 : "непарне " + 1));

	}

}
