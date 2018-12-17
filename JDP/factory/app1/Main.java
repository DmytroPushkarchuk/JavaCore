package factory.app1;

import java.util.Scanner;

import factory.app1.developer.Developer;
import factory.app1.developer.InterfaceDeveloper;
import factory.app1.factory.DeveloperFactory;
import factory.app1.factory.InterfaceDeveloperFactory;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		InterfaceDeveloperFactory developerFactory = DeveloperFactory.createDeveloperFactoryBySpecialty(scanner.next());
		InterfaceDeveloper developer = developerFactory.createDeveloper();

		InterfaceDeveloper developer2 = Developer.createDeveloperBySpecialty(scanner.next());

		scanner.close();

		developer.codeDeveloper();
		developer2.codeDeveloper();
	}

}
