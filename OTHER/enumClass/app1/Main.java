package enumClass.app1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student student = new Student("Harry Potter", Faculty.GRYFFINDOR);
		
		System.out.println("Choose from this faculties:");
		
		for (Faculty iterFacult : Faculty.values()) {
			System.out.println(iterFacult);
		}
		
		
		

		System.out.println("Which faculty? (from 1 to 4)");

		Scanner hat = new Scanner(System.in);

		Faculty hogwartsFaculty = Faculty.values()[hat.nextInt()-1];

		hat.close();

		if (student.faculty == hogwartsFaculty) {
			System.out.println("It's true! Harry Potter in " + student.faculty);
		} else {
			System.out.println("False! Harry Potter not in  " + hogwartsFaculty);
		}

	}

}
