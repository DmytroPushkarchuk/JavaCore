package other;

import java.util.ArrayList;
import java.util.Scanner;

public class scannerApp2 {

	private static ArrayList<Integer> arr = new ArrayList<Integer>();
	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("������ ����� �� 1 �� 100, 0 ��������� �������� �������� ������.");
		int input = reader.nextInt();
		while (input !=0) {
			
			if (input>=0 && input<= 100) {
				arr.add(input);
			}
			else
			{
				System.out.println("����� �� � ������� �� 1 �� 100 �������.");
			}
			
			input = reader.nextInt();
			}
		
		System.out.println("�������� ���������.");
		
		for (int i = 1; i <=10; i++) {
			int number1 = (i-1)*10+1;
			int number2 = i*10;
			int counter = 0;
			
			System.out.print(number1 + "-" + number2 +"		|");
			
			for (int number : arr) {
				if (number >=number1 && number <= number2) {
					counter++;
				}
			}
			
			for (int x = 0; x < counter; x++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
}



