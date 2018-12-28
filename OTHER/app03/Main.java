package app03;

import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Computer[] computers = new Computer[] { new Computer("Sony Vaio"), new Computer("MacBook Pro"),
				new Computer("MacBook Air") };

		for (Computer iterComp : computers) {
			iterComp.turnOn();
		}
		
		System.out.println("Are you sure to turn off your computers?");
		
		Scanner scanner = new Scanner(System.in);
		String cache = scanner.nextLine();
		scanner.close();
		
		if (Objects.equals(cache, "Y")) {
			System.out.println("Computers will be turn off");
			for (Computer iterComp : computers) {
				iterComp.turnOff();
			}
		} else if (Objects.equals(cache, "N")) {
			System.out.println("Computer will continue to work");
		} else
			System.out.println("Unknown command!");

	}

}
